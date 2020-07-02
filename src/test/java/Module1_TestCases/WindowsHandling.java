package Module1_TestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowsHandling {
	
	static WebDriver driver;
	
	@BeforeTest
	
	public static void login() 
	
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://phptravels.com/");
				
	}
	
	@Test 
	
	public static void CaptureTitle() throws InterruptedException {
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(".//*[text()='Log in']")).click();
		
		Thread.sleep(10000);
		
		String Parentwindow=driver.getWindowHandle();
		
		System.out.println("Parentwindow Id" +Parentwindow);
		
		Set<String> AllWindows=driver.getWindowHandles();
		
		System.out.println("AllWindows Ids" +AllWindows);
		
		for(String childwindow : AllWindows)
			
		{
			if(!childwindow.equals(Parentwindow))
					
			{
			
				driver.switchTo().window(childwindow);
				
				System.out.println("Title of child window : "+ driver.getTitle());
				
				driver.switchTo().window(Parentwindow);
			}
			
            
		}
		
	}
		
	@Test(priority=2)
	
	public static void CaptureParentWindowTitle() throws InterruptedException
	
	{
		
		Thread.sleep(5000);
        
        System.out.println("Title of Parent window : "+ driver.getTitle());
		
	}
	
	
	}


