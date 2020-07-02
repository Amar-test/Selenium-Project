package Module1_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pages.Loginpage;

public class LoginTestcase {
	
static WebDriver driver;

@BeforeTest

public static void login()
	
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		Loginpage.UserName(driver).sendKeys("Admin");
		
		Loginpage.PassWord(driver).sendKeys("admin123");
		
		Loginpage.Loginbutton(driver).click();
		
	}

@Test 

public static void verifytile() throws InterruptedException

{
	Thread.sleep(5000);
	
	System.out.println("driver: " +driver);
	
	try {

	driver.findElement(By.xpath("//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[1]/div/a/img")).click();
	
	}
	
	catch(Exception e)
	
	{
		System.out.println(e.getStackTrace());
	}
	
	Thread.sleep(5000);
	
	WebElement AssignLeaveTitle=driver.findElement(By.xpath(".//*[@id='assign-leave']/div/h1"));
	
	Assert.assertEquals(AssignLeaveTitle.getText(), "Assign Leave");
	
	
}


}
