package test.PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class w3BluepagesSearch {
	
	private WebDriver wd;
	
	public w3BluepagesSearch(WebDriver wd) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\CARLOSALFREDOGONZALE\\selenium\\gekodriver\\geckodriver.exe");
		this.wd = wd;
		PageFactory.initElements(wd, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"search-input\"]") public WebElement searchbar;
	public String searchText;
	
//	@FindBy(xpath="/html/body/div[8]/div[2]/div/div/div[1]") 
	public WebElement proof;
	
	public void search() throws Exception 
	{
		searchbar.click();
		searchbar.sendKeys(searchText);
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(wd, 10);
		proof = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/span/div/span[1]")));
	}
	
	

}
