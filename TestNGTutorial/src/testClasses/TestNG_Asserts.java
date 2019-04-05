package testClasses;

import org.testng.annotations.Test;

import appcode.SomeClassToTest;

public class TestNG_Asserts {
	@Test
	// method to annotate test method
	public void testMethod1() {
		System.out.println("Running Test -> testSum");
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumber(4, 7);
		
	}
	@Test
	// method to annotate test method
	public void testMethod2() {
		System.out.println("Running Test -> testString");
		String expectedString = "Hello World";
		SomeClassToTest obj = new SomeClassToTest();
	
		
	}
	@Test
	// method to annotate test method
	public void testMethod3() {
		System.out.println("Running test -> testArray");
		int[] expectedArray = {1,2,3};
		
	}

}
