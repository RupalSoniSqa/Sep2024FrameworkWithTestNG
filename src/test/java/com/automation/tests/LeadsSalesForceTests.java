package com.automation.tests;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automation.base.BaseFirebase;

public class LeadsSalesForceTests extends BaseFirebase{

	private Logger mylog = LogManager.getLogger(UserMenuDropDownTests.class);
	
	@Test
	public void Leads_Tab() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement leadsTabEle = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
		clickElement(leadsTabEle, "leads tab");
		Thread.sleep(5000);

		closeDriver();

	}
	@Test
	public void Leads_SelectView() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement leadsTabEle = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
		clickElement(leadsTabEle, "leads tab");
		Thread.sleep(5000);

		WebElement drpviewEle = driver.findElement(By.id("fcf"));
		Select drpview = new Select(drpviewEle);

		List<WebElement> options = drpview.getOptions();
		System.out.println("Names of options in a drop down:" + options.size());

		closeDriver();
	}
	@Test
	public void Default_View() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement leadsTabEle = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
		clickElement(leadsTabEle, "leads tab");
		Thread.sleep(5000);

		WebElement newTabEle = driver.findElement(By.name("new"));
		clickElement(newTabEle, "new tab");
		Thread.sleep(5000);

		WebElement lastnameEle = driver.findElement(By.id("name_lastlea2"));
		enterText(lastnameEle, "ABCD", "lastname");

		WebElement companynameEle = driver.findElement(By.name("lea3"));
		enterText(companynameEle, "ABCD", "company name");

		WebElement saveEle = driver.findElement(By.name("save"));
		clickElement(saveEle, "save button");
		Thread.sleep(2000);

		closeDriver();

	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		LeadsSalesForceTests ob = new LeadsSalesForceTests();

		ob.Leads_Tab();
		//ob.Leads_SelectView();
		//ob.Default_View();
		
	}
}
