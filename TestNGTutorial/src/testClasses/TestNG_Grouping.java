package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Grouping {

	/*As beforeClass or After class does not belongs to any group
	 * they will not be executed 
	 */
	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@Test(groups = {"cars","suv"})//Multiple name assigned  into a group
	public void testBMWX6() {
		System.out.println("Running Test - testBMWX6");
	}

	@Test(groups = {"cars","sedan"})
	public void testAudi6() {
		System.out.println("Running Test - testAudi6");
	}

	@Test(groups = {"Bike"})
	public void testNinja() {
		System.out.println("Running Test - testNinja");
	}

	@Test(groups = {"Bike"})
	public void testHondaCBR() {
		System.out.println("Running Test - testHondaCBR");
	}
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		System.out.println("After Class");
	}	
	

}
