package com.sqa.uj.core;

import org.testng.annotations.*;

public abstract class LoginTest extends BasicTest {

	public LoginTest(String baseURL) {
		super(baseURL);
	}

	public abstract void logIn();

	public abstract void logOut();

	@BeforeMethod
	@Override
	public void setupTest() {
		super.setupTest();
		logIn();
	}

	@AfterMethod
	public void logOutTest() {
		logOut();
	}
}
