package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG_BeforeClassAnnotation {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nThis runs before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nThis runs after every method");
	}

	@Test
	public void testMethod1() {
		System.out.println("\nRunning Test -> testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test -> testMethod2");
	}

}
