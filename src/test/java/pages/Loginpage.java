package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
	static WebElement element=null;
	
	public static WebElement UserName(WebDriver driver)
	
	{
		
		element =driver.findElement(By.xpath(".//*[@id='txtUsername']"));
		
		return element;
		
		
	}
	
	public static WebElement PassWord(WebDriver driver)
	
	{
		
		element=driver.findElement(By.xpath(".//*[@id='txtPassword']"));

		return element;
	}
	
	
public static WebElement Loginbutton(WebDriver driver)
	
	{
		
		element=driver.findElement(By.xpath(".//*[@id='btnLogin']"));

		return element;
	}
}
