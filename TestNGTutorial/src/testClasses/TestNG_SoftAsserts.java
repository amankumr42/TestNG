package testClasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcode.SomeClassToTest;

public class TestNG_SoftAsserts {
	@Test
	public void testSum() {
		
		SoftAssert sa = new SoftAssert();
		System.out.println("\nRunning Test -> testSum");
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumber(1, 2);
		//Any verification assert fails then all the method is failed 
		//in order to remove this we need soft asserts
		//If first assert fail need to run the test again without breaking
		sa.assertEquals(result, 2);
		System.out.println("Line after assert 1");
		sa.assertEquals(result, 3);
		System.out.println("Line after assert 2");
		sa.assertAll();//check the failed test case
	}
}
