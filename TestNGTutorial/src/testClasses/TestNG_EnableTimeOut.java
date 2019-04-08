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
	  @Test(enabled=true)
	  public void testMethod1() {
		  System.out.println("TestNG_priority -> testMethod1");
	  }
	  @Test(timeOut=100) //Time in ms
	  public void testMethod2() {
		  System.out.println("TestNG_priority -> testMethod2");
	  }
}
