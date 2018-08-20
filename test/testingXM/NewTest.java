package test.testingXM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver wd;
	
	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String browser) 
	{
		if(browser.equalsIgnoreCase("ff")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\CARLOSALFREDOGONZALE\\selenium\\gekodriver\\geckodriver.exe");
			this.wd = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\CARLOSALFREDOGONZALE\\selenium\\IEDriverServer.exe");
			this.wd = new InternetExplorerDriver();
		}
		else
		{
			
		}
	}
	
	
  @Test
  public void f() {
	  System.out.println("This is the parent Class speaking...");
  }
}
