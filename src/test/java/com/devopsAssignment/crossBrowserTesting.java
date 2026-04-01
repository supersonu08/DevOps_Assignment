package com.devopsAssignment;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class crossBrowserTesting {
	WebDriver driver;
  @Parameters({"browser"}) 
  @Test
  public void broswerTest(String browser) throws InterruptedException {
	  
	  if(browser.equalsIgnoreCase("Chrome"))
	  {
		  driver = new ChromeDriver();
		  System.out.println("chrome launched");
	  }
	  
	  else if(browser.equalsIgnoreCase("FireFox"))
	  {
		  driver = new FirefoxDriver();
		  System.out.println("firefox launched");
	  }
	  
	  else if(browser.equalsIgnoreCase("Edge"))
	  {
		  driver = new EdgeDriver();
		  System.out.println("edge launched");
	  }
	  
	  else {
		  System.out.println("Invalid borwser");
	  }
	  
	 
	  driver.get("https://www.amazon.com/");
	  
	  Thread.sleep(2000);
	 
	  String acttitle = driver.getTitle();
	 	  
	  AssertJUnit.assertTrue(acttitle.contains("Amazon"));
	 
	  driver.close();
  }
}
