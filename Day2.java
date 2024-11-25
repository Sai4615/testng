package Basic;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
@Test(groups= {"smoke"})
	public void name() {
		System.out.println("Result1 - Vanisri" );
	}
@BeforeTest		
	public void name1() {
		System.out.println("Result2 - Karthik - BeforeTest");
		
		}
@BeforeClass
		public void name2() {
			System.out.println("Result3 - Dhaya - BeforeClass");
		}
				
		
	}
	
	

