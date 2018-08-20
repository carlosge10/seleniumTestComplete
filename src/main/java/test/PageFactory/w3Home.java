package test.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class w3Home {

	WebDriver wd;
	
	public w3Home(WebDriver wd) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\CARLOSALFREDOGONZALE\\selenium\\gekodriver\\geckodriver.exe");
		this.wd = wd;
		PageFactory.initElements(wd, this);
//		wd.get("https://w3.ibm.com/#home");
	}
	
	///html/body/div[3]/header/div[5]/div/button
	///html/body/div[3]/div/div/div[1]/div/div/p[3]/button[1]
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/div/p[3]/button[1]") public WebElement signinBtn;
	public void signin() 
	{
		signinBtn.click();
	}
	
}
