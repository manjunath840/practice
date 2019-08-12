package practiceERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	//declearation
	private WebElement untb;
	private WebElement pwtb;
	private WebElement logintb;
	
	//initialisation
	public LoginPage(WebDriver driver) {
	
		untb = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		pwtb = driver.findElement(By.xpath("//input[@name='pwd']"));
		logintb = driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	
	//utilisation
	public  void enterUsername(String un)
	{
		untb.sendKeys(un);
	}
	
	public  void enterPassword(String pw)
	{
		pwtb.sendKeys(pw);
	}
	
	public  void click()
	{
		logintb.click();
	}
	

}
