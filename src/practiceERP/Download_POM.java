package practiceERP;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Download_POM
{
	//declearation
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;

	//initialisation
	public Download_POM(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	//utilisation
	public void getallLinks()
	{
		int count =allLinks.size();
		System.out.println(count);
		
		for (WebElement link : allLinks) {
		String	text =link.getText();
		
		System.out.println(text);
		}
		
	}
	
	
}
