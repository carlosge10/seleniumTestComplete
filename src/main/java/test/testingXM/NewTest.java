package test.testingXM;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	
	protected WebDriver wd;
	protected String url;
	Random gen;
	@Parameters({"browser", "environment"})
	@BeforeClass
	public void beforeTest(String browser, String environment) {
		System.out.println(environment);
	    gen = new Random(314);
		if(browser.equalsIgnoreCase("ff")){
	    	System.out.println("choosing firefox");
	    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\CARLOSALFREDOGONZALE\\selenium\\gekodriver\\geckodriver.exe");
	    	this.wd = new FirefoxDriver();
	    }
	    else if(browser.equalsIgnoreCase("ie")){
	    	System.out.println("choosing internet explorer");
	    	System.setProperty("webdriver.ie.driver", "C:\\Users\\CARLOSALFREDOGONZALE\\selenium\\IEDriverServer.exe");
	        this.wd = new InternetExplorerDriver();
	    }
	    else if(browser.equalsIgnoreCase("gc")){
	    	System.out.println("choosing google chrome");
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\CARLOSALFREDOGONZALE\\selenium\\chromedriver.exe");
	        this.wd = new ChromeDriver();
	    }
	    else{
	        wd = new FirefoxDriver();
	    }
	}
	
  @Test
  public void fp() {
	  try {
		  System.out.println("this is the parent speaking...");
		  assert(true);
	  }
	  catch(Exception ex)
	  {
		  assert(false);
	  }
  }
  
  /*
   * 
   * */
  
  @AfterClass
  public void afterTest() 
  {
	  System.out.println("all done...");
	  this.wd.close();
  }
  
}
