package com.automation.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automation.base.BaseFirebase;

public class CreatAccount_SalesForceTests extends BaseFirebase {

	private Logger mylog = LogManager.getLogger(UserMenuDropDownTests.class);
 
	@Test
	public void Create_Account() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement accountEle = driver.findElement(By.cssSelector("#Account_Tab > a"));
		clickElement(accountEle, "account button");
		Thread.sleep(5000);

		WebElement newbutton = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
		newbutton.click();
		Thread.sleep(5000);

		WebElement accountname = driver.findElement(By.id("acc2"));
		accountname.sendKeys("sonu");
		Thread.sleep(5000);

		WebElement ddown = driver.findElement(By.xpath("//*[@id=\"acc6\"]"));
		Select select = new Select(ddown);
		select.selectByVisibleText("Technology Partner");
		Thread.sleep(5000);

		WebElement ddown1 = driver.findElement(By.id("00Naj000005K6Pm"));
		Select select1 = new Select(ddown1);
		select1.selectByVisibleText("High");
		Thread.sleep(5000);

		closeDriver();
	}
	
	@Test
	public void Create_View() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement accountEle = driver.findElement(By.cssSelector("#Account_Tab > a"));
		clickElement(accountEle, "account button");
		Thread.sleep(5000);

		WebElement creatnewviewlink = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
		creatnewviewlink.click();
		Thread.sleep(5000);

		WebElement viewname = driver.findElement(By.id("fname"));
		viewname.sendKeys("sonnuu");
		Thread.sleep(5000);

		WebElement uniquename = driver.findElement(By.id("devname"));
		uniquename.sendKeys("sonnuu1");
		Thread.sleep(5000);

		WebElement save = driver.findElement(By.name("save"));
		save.click();
		Thread.sleep(5000);

		Thread.sleep(5000);

		closeDriver();

	}
	
	@Test
	public void Edit_View() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement accountEle = driver.findElement(By.cssSelector("#Account_Tab > a"));
		clickElement(accountEle, "account button");
		Thread.sleep(5000);

		WebElement editlink = driver
				.findElement(By.cssSelector("#filter_element > div > span > span.fFooter > a:nth-child(1)"));
		editlink.click();
		Thread.sleep(5000);

		WebElement viewname = driver.findElement(By.id("fname"));
		viewname.sendKeys("sonoo");
		Thread.sleep(5000);

		WebElement filterfields = driver.findElement(By.id("fcol1"));
		Select select = new Select(filterfields);
		select.selectByIndex(1);
		Thread.sleep(5000);

		WebElement operators = driver.findElement(By.id("fop1"));
		Select select1 = new Select(operators);
		select1.selectByIndex(3);
		Thread.sleep(2000);

		WebElement value = driver.findElement(By.id("fval1"));
		value.sendKeys("a");
		Thread.sleep(2000);

		WebElement save = driver.findElement(By.name("save"));
		save.click();
		Thread.sleep(2000);

		closeDriver();
	}
	
	@Test
	public void MergeAccounts_View() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement accountEle = driver.findElement(By.cssSelector("#Account_Tab > a"));
		clickElement(accountEle, "account button");
		Thread.sleep(5000);

		WebElement mergeaccountEle = driver
				.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a"));
		clickElement(mergeaccountEle, "account button");
		Thread.sleep(5000);

		closeDriver();

	}
	
	@Test
	public void CreateAccounts_Report() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement accountEle = driver.findElement(By.cssSelector("#Account_Tab > a"));
		clickElement(accountEle, "account button");
		Thread.sleep(5000);

		WebElement activityaccountEle = driver
				.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a"));
		clickElement(activityaccountEle, "account button");
		Thread.sleep(5000);

		WebElement saveEle = driver.findElement(By.id("ext-gen49"));
		clickElement(saveEle, "save button");
		Thread.sleep(2000);

		closeDriver();
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		CreatAccount_SalesForceTests ob = new CreatAccount_SalesForceTests();

		ob.Create_Account();
		ob.Create_View();
		ob.Edit_View();
		ob.MergeAccounts_View();
		ob.CreateAccounts_Report();
	}
}