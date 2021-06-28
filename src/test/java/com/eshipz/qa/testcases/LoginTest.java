package com.eshipz.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.eshipz.qa.base.BaseClass;
import com.eshipz.qa.pages.HomePage;
import com.eshipz.qa.pages.LoginPage;

public class LoginTest extends BaseClass
{
	LoginPage log;
	HomePage hm_pg;
	public LoginTest() {
		//super keyword is used to call super class constructor i.e., base class constructor, if this is not done then we will get null pointer exception since properties file will not be loaded
		super();
	}

	@BeforeTest
	public void setUp()
	{
		launchApp();
		log = new LoginPage();
	}
	@Test
	public void login() {
		hm_pg = log.eshipzLogin(pro.getProperty("username"), pro.getProperty("password"));
		String text = hm_pg.verifyHomePage();
		Assert.assertEquals("Welcome", text, "Didn't land on Home page");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
