package com.bit.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest 
{
	WebDriver dr;
	@Before
	public void start() throws IOException{
		String s=System.getProperty("browser");
		if(s.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/bittech/Desktop/Driver/chromedriver");
			dr = new ChromeDriver();
		}
		else if(s.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "/Users/bittech/Downloads/geckodriver");
			
			dr = new FirefoxDriver();
		}
		
		else if (s.equals("internetExplorer")) {
			System.setProperty("webdriver.ie.driver", "/Users/bittech/Desktop/Driver/IEDriverServer");
			dr = new InternetExplorerDriver();
		}
		
		dr.get("http://www.eshopper24.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@After
	public void end() throws InterruptedException{
		Thread.sleep(5000);
		dr.quit();
	}



}
