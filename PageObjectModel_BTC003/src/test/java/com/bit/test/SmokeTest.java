package com.bit.test;

import org.junit.Test;

import com.bit.support.HomePage;
import com.bit.support.MenPage;

public class SmokeTest extends BaseTest
{
	@Test
	public void test1()
	{
		HomePage hp=new HomePage(dr);
		hp.verifyTitle();
		MenPage mp=hp.clickMenLink().get();
		
		mp.clickWomen();
	}

}
