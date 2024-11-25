package Basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {
	@Test
	public void day () {
		System.out.println("day-Day1");
	}
	@BeforeMethod	
	public void day11() {
	System.out.println("day11- Day1 - BeforeMethod");
}
	@BeforeSuite
	public void day12() {
		System.out.println("day12- Day1-BeforeSuite ");	
	}
	@Test (groups= {"smoke"})
	public void day13() {
		System.out.println("Day13 - @Test");
	}
	
	@AfterMethod
	public void day14() {
		System.out.println("Day14 - @AfterMethod");
}}
