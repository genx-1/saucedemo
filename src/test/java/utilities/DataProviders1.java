package utilities;

import org.testng.annotations.DataProvider;

public class DataProviders1 {
	
	
	@DataProvider (name = "loginWithoutExcel" )
	
	public String [][] loginWithoutExcel() {
		 String data [][] ={
			{"standard_user", "secret_sauce", "valid"},
			
			{"problem_user" , "secret_sauce" , "valid"},
			{"performance_glitch_user" , "secret_sauce", "valid"},
			
			{"error_user", "secret_sauce" , "valid"},
			{"visual_user", "secret_sauce", "valid"},
			{"locked_out_user" , "secret_sauce" , "invalid"}
		
	};
	return data;
	}	
		
		
		
		
}
