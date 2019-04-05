package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import appcode.SomeClassToTest;

public class TestNG_Asserts {
	@Test
	// method to annotate test method
	public void testMethod1() {
		System.out.println("Running Test -> testSum");
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumber(4, 7);
		Assert.assertEquals(result, 11);
		
	}
	@Test
	// method to annotate test method
	public void testMethod2() {
		System.out.println("Running Test -> testString");
		String expectedString = "Hello World";
		SomeClassToTest obj = new SomeClassToTest();
		String result = obj.addStrings("Hello", "World");
		Assert.assertEquals(result, expectedString);
			}
	@Test
	// method to annotate test method
	public void testMethod3() {
		System.out.println("Running test -> testArray");
		int[] expectedArray = {1,2,9};
		SomeClassToTest obj = new SomeClassToTest();
		int[] result = obj.getArray();
		Assert.assertEquals(result, expectedArray);		
	}
}
