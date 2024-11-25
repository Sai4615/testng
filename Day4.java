package Basic;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Day4 {
@Test
	public void homeloan() {
		System.out.println("Homeloan-Day4");
	}
@Test (enabled = false)
	public void Bikeloan() {
		System.out.println("Bikeloan-Day4");
	}
@Parameters({"URL"})
@Test	
	public void carloan(String URLname) {
		System.out.println("carloan-Day4");
	System.out.println(URLname);
	}
}
