package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_EnableTimeOut {
	@BeforeClass
	public void setUp() {
		System.out.println("Before classs");
	}

	@AfterClass
	public void CleanUp() {
		System.out.println("After class");
	}

	@Test(enabled = true)
	public void testMethod1() {
		System.out.println("TestNG_priority -> testMethod1");
	}

	/*
	 * Test NG must fail this method as we are waiting for 200 ms
	 *  and testNg timeout is set for 100 ms */
	@Test(timeOut = 100) // Time in ms
	public void testMethod2() throws InterruptedException {
		System.out.println("TestNG_priority -> testMethod2");
		Thread.sleep(200);
	}
}
