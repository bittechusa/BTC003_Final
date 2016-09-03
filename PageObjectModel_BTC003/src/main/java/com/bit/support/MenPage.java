package com.bit.support;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

public class MenPage extends LoadableComponent<MenPage>{
	WebDriver dr;
	public MenPage(WebDriver m)
	{
		dr=m;
	}
	public WomenPage clickWomen(){
		dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/a/b")).click();
		return new WomenPage();
	}
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		System.out.println("load");
		dr.get("https://www.eshopper24.com/men");
	}
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		Assert.assertTrue(dr.getCurrentUrl().equals("https://www.eshopper24.com/men"));
	    System.out.println("isload");
	}
}
