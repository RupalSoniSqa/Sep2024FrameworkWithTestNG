package com.automation.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.base.BaseFirebase;

public class AlltabsSalesForceTests extends BaseFirebase {

	private Logger mylog = LogManager.getLogger(UserMenuDropDownTests.class);
	@Test
	public void Validate_FirstandLastName() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		
		
		WebElement homeEle = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		clickElement(homeEle, "home button");
		Thread.sleep(5000);

		WebElement namelinkEle = driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a"));
		clickElement(namelinkEle, "namelink button");
		Thread.sleep(5000);

		closeDriver();

	}
	@Test
	public void Validate_EditedLastName() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);
		
		WebElement remindmelaterEle = driver.findElement(By.xpath("//*[@id=\"editPage\"]/p[2]/a[1]"));
		clickElement(remindmelaterEle, " button");

		WebElement homeEle = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		clickElement(homeEle, "home button");
		Thread.sleep(5000);

		WebElement namelinkEle = driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a"));
		clickElement(namelinkEle, "namelink button");
		Thread.sleep(5000);

		WebElement editEle = driver
				.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
		clickElement(editEle, "edit button");
		Thread.sleep(5000);

		WebElement aboutEle = driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
		clickElement(aboutEle, "about button");
		Thread.sleep(5000);

		WebElement lastnameEle = driver.findElement(By.name("lastname"));
		enterText(lastnameEle, "ABCD", "lastname");

		WebElement saveallEle = driver.findElement(By.className("zen-btn zen-primaryBtn zen-pas"));
		clickElement(saveallEle, "saveall button");
		Thread.sleep(5000);

		closeDriver();
	}
	@Test
	public void Validate_Alltab() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement remindmelaterEle = driver.findElement(By.xpath("//*[@id=\"editPage\"]/p[2]/a[1]"));
		clickElement(remindmelaterEle, " button");

		WebElement alltabEle = driver.findElement(By.className("allTabsArrow"));
		clickElement(alltabEle, "alltab button");
		Thread.sleep(5000);

		WebElement customizemytabsEle = driver.findElement(By.name("customize"));
		clickElement(customizemytabsEle, "customizetab button");
		Thread.sleep(5000);

		WebElement saveEle = driver.findElement(By.name("save"));
		clickElement(saveEle, "saveandnew button");
		Thread.sleep(2000);

		WebElement menubtnEle = driver.findElement(By.className("mruText"));
		clickElement(menubtnEle, "menu button");
		Thread.sleep(2000);

		closeDriver();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		AlltabsSalesForceTests ob = new AlltabsSalesForceTests() ;

		ob.Validate_FirstandLastName();
		//ob.Validate_EditedLastName();
		//ob.Validate_Alltab();

}
}
