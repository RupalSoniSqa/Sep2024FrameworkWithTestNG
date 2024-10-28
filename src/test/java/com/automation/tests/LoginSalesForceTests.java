package com.automation.tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.base.BaseFirebase;
import com.automation.utility.Constants;
import com.automation.utility.PropertiesUtility;


public class LoginSalesForceTests extends BaseFirebase {

	private Logger mylog = LogManager.getLogger(LoginSalesForceTests.class);

	@Test
	public void SalesForce_loginErrorMessage() throws InterruptedException, IOException {

		WebElement usernameEle = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		String usernameData = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		enterText(usernameEle, usernameData, "username");

		WebElement passwordEle = driver.findElement(By.id("password"));
		if (passwordEle.isDisplayed()) {
			passwordEle.clear();
		} else {
			mylog.error(usernameData);
		}
		mylog.info("Please enter your password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(2000);

		extentReportUtility.logTestinfo("test completed");

	}

	@Test
	public void SalesForce_login() throws InterruptedException {

		WebElement usernameEle = driver.findElement(By.id("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(2000);

		WebElement remindmelaterEle = driver.findElement(By.xpath("//*[@id=\"editPage\"]/p[2]/a[1]"));
		clickElement(remindmelaterEle, " button");
		Thread.sleep(2000);

		closeDriver();

	}

	public void Check_RememberMe() throws InterruptedException {

		

		WebElement usernameEle = driver.findElement(By.id("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement remembermeEle = driver.findElement(By.id("rememberUn"));
		clickElement(remembermeEle, "rememberme checkbox");
		Thread.sleep(5000);

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		closeDriver();

	}
	
	public void Forgot_Password() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement forgotpasswordEle = driver.findElement(By.id("forgot_password_link"));
		clickElement(forgotpasswordEle, "forgotpassword link");
		Thread.sleep(5000);

		WebElement usernameEle = driver.findElement(By.id("un"));
		enterText(usernameEle, "rupal@tekarch.com", "username");
		Thread.sleep(5000);

		WebElement buttonEle = driver.findElement(By.id("continue"));
		clickElement(buttonEle, "continue button");
		Thread.sleep(5000);
		
		WebElement returntologinEle = driver.findElement(By.xpath("//*[@id=\"forgotPassForm\"]/a"));
		clickElement (returntologinEle, "returntologinele");
		Thread.sleep(5000);

		closeDriver();
	}
	
	public void ValidateLoginError_Message() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "123", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "22131", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		closeDriver();
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		SalesforceScripts ob = new SalesforceScripts();

		//ob.SalesForce_loginErrorMessage();
		//ob.SalesForce_login();
		//ob.Check_RememberMe();
		ob.Forgot_Password();
		//ob.ValidateLoginError_Message();
	}
}
