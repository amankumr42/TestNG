package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_TestClass1 {

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("\n TestNG_TestClass1->This run before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("\n TestNG_TestClass1->This  run after every method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("\n  TestNG_TestClass1->This run once before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("\n TestNG_TestClass1-> This run once after every class");
  }
  @Test
  public void testMethod1() {
	  System.out.println("\nRunning Test -> TestNG_TestClass1-> testMethod1");
  }
  @Test
  public void testMethod2() {
	  System.out.println("\\nRunning Test -> TestNG_TestClass1-> testMethod1");
  }
}
