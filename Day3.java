package Basic;

import org.testng.annotations.Test;

public class Day3 {

@Test (enabled = false)
	public void HDFC() {
		System.out.println("HDFC-Day3");
	}
@Test (dependsOnMethods= {"Indian"})
	public void ICICI() {
		System.out.println("ICICI-Day3");
	}
@Test	
	public void SBI() {
		System.out.println("SBI-Day3");
	}

@Test	
public void Indian() {
	System.out.println("Indian-Day3");
}
}
