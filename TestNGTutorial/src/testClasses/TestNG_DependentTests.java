package testClasses;

import appcode.SomeClassToTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_DependentTests {
	SomeClassToTest obj;

	@BeforeClass
	public void setup() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("After class");
	}

	/*
	 * Making the testMethod2 dependent on testMethod 1
	 */

	@Test(dependsOnMethods = { "testMethod2" })
	public void testMethod1() {
		System.out.println("testMethod1");
		int result = obj.sumNumber(1, 2);
		Assert.assertEquals(result, 3);
	}

	@Test
	public void testMethod2() {
		System.out.println("testMethod2");
	}

	@Test(dependsOnMethods = { "testMethod1" })
	public void testMethod3() {
		System.out.println("testMethod3");
	}

	@Test
	public void testMethod4() {
		System.out.println("testMethod4");
	}
}
