package testBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static   Properties prop;
	public static  WebDriver driver;
	
	@BeforeClass
	public static void setup() throws IOException {
	
		
		  String path = System.getProperty("user.dir") + "/src/test/resources/config.properties";
		  FileReader file = new FileReader(path);
		  prop = new Properties();
		  prop.load(file);
		
		
   driver = new ChromeDriver();
  driver.get(prop.getProperty("url"));
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  
}
	
	/*@AfterClass
	public void teardown() {
		driver.quit();
	}*/
}