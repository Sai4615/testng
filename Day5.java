package Basic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day5 {
	@Test(dataProvider = "Total")
	public void user1 (String Username, String Password) {
		System.out.println(Username);
		System.out.println(Password);
		
	}
	
	@DataProvider
	public Object Total () {
		
		Object[][]data = new Object[3][2];
				data[0][0] = "First Username";
				data[0][1] = "Password";
				
				data[1][0] = "Second Username";
				data[1][1] = "Second Password";
				
				data[2][0] = "Third Username";
				data[2][1] = "Third Password";
				
				return data;
						
						
	}
		
		
	}
