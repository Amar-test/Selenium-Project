package Module1_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.Loginpage;

public class NewTest {
	
  @Test
  
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		Loginpage.UserName(driver).sendKeys("Admin");
		
		Loginpage.PassWord(driver).sendKeys("admin123");
		
		Loginpage.Loginbutton(driver).click();
		
  }
  
  
}
