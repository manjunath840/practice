package practiceERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POM
{
	//declearation
	@FindBy(xpath="//*[@id=\"username\"]")
	private WebElement untb;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwtb;
		
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement logintb;
		
		//initialisation
		public Login_POM(WebDriver driver) {
		
			PageFactory.initElements(driver, this);
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
