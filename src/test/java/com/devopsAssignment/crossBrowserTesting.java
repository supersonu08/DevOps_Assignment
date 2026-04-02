package com.devopsAssignment;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting {
	WebDriver driver;
  @Parameters({"browser"}) 
  @Test
  public void broswerTest(String browser) throws InterruptedException, MalformedURLException, URISyntaxException {
	  
	  if(browser.equalsIgnoreCase("Chrome"))
	  {
		  ChromeOptions options = new ChromeOptions();
		  driver = new RemoteWebDriver(new URI("http://localhost:4444").toURL(),options);
		  System.out.println("chrome launched");
	  }
	  
	  else if(browser.equalsIgnoreCase("FireFox"))
	  {
		  FirefoxOptions options = new FirefoxOptions();
		  driver = new RemoteWebDriver(new URI("http://localhost:4444").toURL(),options);
		  
		  System.out.println("firefox launched");
	  }
	  
	  else if(browser.equalsIgnoreCase("Edge"))
	  {
		  EdgeOptions options = new EdgeOptions();
		  driver = new RemoteWebDriver(new URI("http://localhost:4444").toURL(),options);
		  System.out.println("edge launched");
	  }
	  
	  else { 
		  System.out.println("Invalid borwser");
	  }
	  
	 
	  driver.get("https://www.amazon.com/");	  
	  Thread.sleep(2000);	 
	  String acttitle = driver.getTitle();
	 	  
	  AssertJUnit.assertTrue(acttitle.contains("Amazon"));	 
	  driver.quit();
  }
}
