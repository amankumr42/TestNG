package testClasses;

import org.testng.annotations.Test;

import appcode.SomeClassToTest;
//import org.testng.annotations.Test;


public class TestAnnotation {

	@Test
	// method to annotate test method
	public void testMethod1() {
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumber(4, 7);
		System.out.println(result);
		System.out.println("Running test -> testMethod1");
		
	}
	@Test
	// method to annotate test method
	public void testMethod2() {
		System.out.println("Running test -> testMethod2");
		
	}
	@Test
	// method to annotate test method
	public void testMethod3() {
		System.out.println("Running test -> testMethod3");
		
	}	
	//Default order to run basis of method name (alphabetically)
}
