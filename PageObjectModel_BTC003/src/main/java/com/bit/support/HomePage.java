package com.bit.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage 
{
	WebDriver dr;
	public HomePage(WebDriver m)
	{
		dr=m;
	}
	public void verifyTitle()
	{
		System.out.println(dr.getTitle().contains("home"));
	}
	public MenPage clickMenLink()
	{
		
		dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a/b")).click();
		return new MenPage(dr);
	}

}
