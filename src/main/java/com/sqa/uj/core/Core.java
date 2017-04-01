package com.sqa.uj.core;

import org.apache.log4j.*;
import org.openqa.selenium.*;
import com.sqa.uj.helpers.*;

public abstract class Core {

	protected WebDriver driver;
	private String baseURL;
	private Logger logger = Logger.getLogger(Core.class);

	public boolean takeScreenshot(String fileName) {
		fileName = fileName.replace(" ", "_");
		fileName = fileName.replace("*", "");
		fileName = fileName.replace("\"", "");
		fileName = fileName.replace(",", "");
		return AutoBasics.takeScreenshot(getDriver(), "screenshots/" + fileName, getLogger());
	}

	public boolean isPresent(By locator) {
		return AutoBasics.isElementPresent(getDriver(), locator, getLogger());
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public String getBaseURL() {
		return this.baseURL;
	}

	public Logger getLogger() {
		return this.logger;
	}

	public Core(WebDriver driver, String baseURL) {
		super();
		this.driver = driver;
		this.baseURL = baseURL;
	}

	public boolean write(String property, String value) {
		return AutoBasics.setProp(getPropsLocation(), property, value, this.logger, "Core Properties:" + getBaseURL());
	}

	public String read(String property) {
		return AutoBasics.getProp(getPropsLocation(), property, getLogger());
	}

	public abstract String getPropsLocation();
}
