package com.automation.base;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.automation.utility.Constants;
import com.automation.utility.PropertiesUtility;

public class BaseFirebase extends BaseTest {

	private Logger mylog = LogManager.getLogger(BaseFirebase.class);

	@BeforeMethod
	@Parameters("browserName")
	public void setUpBeforeMethod(@Optional("chrome") String name) throws InterruptedException, IOException {

		mylog.info("**********setUpBeforeMethod**********");
		launchBrowser("chrome");
		String url = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "url");
		goToUrl(url);

	}

	@AfterMethod
	public void tearDownAfterMethod() throws InterruptedException {
		closeDriver();
		mylog.info("**********tearDownAfterTestMethod**********");

	}

	public void Login_Firebase() throws InterruptedException, IOException {

		String usernameData = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		String passwordData = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");

		WebElement usernameEle = driver.findElement(By.id("username"));
		enterText(usernameEle, usernameData, "username");

		WebElement passwordEle = driver.findElement(By.id("password"));

		if (passwordEle.isDisplayed()) {
			passwordEle.clear();
		} else {
			mylog.error("password textbox is not displayed");
		}
		mylog.info("Please enter your password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

	}
}
