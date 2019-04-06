package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_Priority {

  @BeforeClass
  public void setUp() {
	  System.out.println("Before classs");
  }
  @AfterClass
  public void CleanUp() {
	  System.out.println("After class");
  }
  @Test(priority=1)
  public void testMethod1() {
	  System.out.println("TestNG_priority -> testMethod1");
  }
  @Test(priority=0)
  public void testMethod2() {
	  System.out.println("TestNG_priority -> testMethod2");
	  
  }

}
