package test.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class w3Login {
	
	WebDriver wd;

	public w3Login(WebDriver wd) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\CARLOSALFREDOGONZALE\\selenium\\gekodriver\\geckodriver.exe");
		this.wd = wd;
		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath="//*[@id=\"btn_signin\"]") public WebElement signinbtn; 
	
	public String usernamestr;
	@FindBy(xpath="//*[@id=\"desktop\"]") public WebElement username;
	public String passwordstr;
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/form/input[4]") public WebElement password;
	
	
	//@FindBy(xpath="//*[@id=\"lfwoZ-17\"]") 
	public WebElement signinproof;
	public void writeUsername() throws Exception
	{
		username.click();
		username.sendKeys(usernamestr);
		password.click();
		password.sendKeys(passwordstr);
		signinbtn.click();
		WebDriverWait wait = new WebDriverWait(wd, 15);
		///html/body/div[3]/header/div[5]/div/button
		//
		////button[ends-with(@id,'-17')]
		signinproof = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id$='-17']")));
	}
	
}
