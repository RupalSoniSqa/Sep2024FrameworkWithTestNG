package com.automation.tests;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automation.base.BaseFirebase;

public class CreateOpportunitiesSalesForceTests extends BaseFirebase {

	private Logger mylog = LogManager.getLogger(UserMenuDropDownTests.class);

	@Test
	public void opportunities_dropdown() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement opportunityEle = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
		clickElement(opportunityEle, "opportunity button");
		Thread.sleep(5000);

		WebElement drpopportunityEle = driver.findElement(By.id("fcf"));
		Select drpopportunity = new Select(drpopportunityEle);

		List<WebElement> options = drpopportunity.getOptions();
		mylog.info("Number of options in a drop down:" + options.size());

		closeDriver();
	}

	@Test
	public void Create_Newopportunities() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement opportunityEle = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
		clickElement(opportunityEle, "opportunity button");
		Thread.sleep(5000);

		WebElement optynameEle = driver.findElement(By.name("name"));
		enterText(optynameEle, "abcde", "optyname");

		WebElement accnoEle = driver.findElement(By.name("account"));
		enterText(accnoEle, "456789", "accno");

		WebElement closedateEle = driver.findElement(By.name("date"));
		enterText(closedateEle, "10/10/2025", "date");

		WebElement stage = driver.findElement(By.id("stage"));
		Select select1 = new Select(stage);
		select1.selectByIndex(3);
		Thread.sleep(2000);

		WebElement amountEle = driver.findElement(By.name("amount"));
		enterText(amountEle, "$125", "amount");

		WebElement saveEle = driver.findElement(By.name("save"));
		clickElement(saveEle, "save button");
		Thread.sleep(2000);

		closeDriver();
	}
	@Test
	public void Test_Opportunitypipeline_Report() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement opportunityEle = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
		clickElement(opportunityEle, "opportunity button");
		Thread.sleep(5000);

		WebElement optypipelinelinkEle = driver
				.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a"));
		clickElement(optypipelinelinkEle, "opty pipeline");
		Thread.sleep(5000);

		closeDriver();

	}
	@Test
	public void Test_Stuck_Opportunity_Report() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement opportunityEle = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
		clickElement(opportunityEle, "opportunity button");
		Thread.sleep(5000);

		WebElement stuckoptyEle = driver
				.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a"));
		clickElement(stuckoptyEle, "stuck opty");
		Thread.sleep(5000);

		closeDriver();
	}
	@Test
	public void Testquaterly_Summary_Report() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement opportunityEle = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
		clickElement(opportunityEle, "opportunity button");
		Thread.sleep(5000);

		WebElement intervaldd = driver.findElement(By.id("quarter_q"));
		Select select1 = new Select(intervaldd);
		select1.selectByIndex(1);
		Thread.sleep(2000);

		WebElement includedd = driver.findElement(By.id("open"));
		Select select = new Select(includedd);
		select.selectByIndex(2);
		Thread.sleep(2000);

		closeDriver();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		CreateOpportunitiesSalesForceTests ob = new CreateOpportunitiesSalesForceTests();

		ob.opportunities_dropdown();
		ob.Create_Newopportunities();
		ob.Test_Opportunitypipeline_Report();
		ob.Test_Stuck_Opportunity_Report();
		ob.Testquaterly_Summary_Report();
	}
}
