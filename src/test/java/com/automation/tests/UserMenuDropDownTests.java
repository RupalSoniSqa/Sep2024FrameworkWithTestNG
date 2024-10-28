package com.automation.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automation.base.BaseFirebase;

public class UserMenuDropDownTests extends BaseFirebase {

	private Logger mylog = LogManager.getLogger(UserMenuDropDownTests.class);

	@Test
	public void Usermenu_dropdown() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

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

		// WebElement remindmelaterEle =
		// driver.findElement(By.xpath("//*[@id=\"editPage\"]/p[2]/a[1]"));
		// clickElement(remindmelaterEle, "remindmelater btn");
		// Thread.sleep(5000);

		WebElement usermenuEle = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		clickElement(usermenuEle, "usermenu dropdown");

		closeDriver();
	}

	@Test
	public void MyProfile_Usermenu_dropdown() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

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

		WebElement usermenuEle = driver.findElement(By.id("userNavLabel"));
		clickElement(usermenuEle, "usermenu dropdown");

		WebElement myprofileEle = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
		clickElement(myprofileEle, "myprofile option");
		Thread.sleep(5000);

		WebElement editEle = driver
				.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
		clickElement(editEle, "edit button");
		Thread.sleep(5000);

		closeDriver();

	}
	@Test
	public void MySetting_Usermenu_dropdown() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

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

		WebElement usermenuEle = driver.findElement(By.id("userNavLabel"));
		clickElement(usermenuEle, "usermenu dropdown");

		WebElement mysettingEle = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]"));
		clickElement(mysettingEle, "mysetting option");
		Thread.sleep(5000);

		WebElement personallinkEle = driver.findElement(By.id("PersonalInfo_font"));
		clickElement(personallinkEle, "personal link");
		Thread.sleep(5000);

		WebElement loginhistorylinkEle = driver.findElement(By.xpath("//*[@id=\"LoginHistory_font\"]"));
		clickElement(loginhistorylinkEle, "loginhistory link");
		Thread.sleep(5000);

		WebElement displayEle = driver.findElement(By.id("DisplayAndLayout_font"));
		clickElement(displayEle, "display link");
		Thread.sleep(5000);

		WebElement customizetabEle = driver.findElement(By.id("CustomizeTabs_font"));
		clickElement(customizetabEle, "customize tab");
		Thread.sleep(5000);

		WebElement ddown = driver.findElement(By.id("p4"));
		Select select = new Select(ddown);
		select.selectByVisibleText("Salesforce Chatter");
		Thread.sleep(5000);

		WebElement addbuttonEle = driver.findElement(By.className("rightArrowIcon"));
		clickElement(addbuttonEle, "add button");
		Thread.sleep(5000);

		WebElement emaillinkEle = driver.findElement(By.id("EmailSetup_font"));
		clickElement(emaillinkEle, "email link");
		Thread.sleep(5000);

		WebElement myemailsettingsEle = driver.findElement(By.id("EmailSettings_font"));
		clickElement(myemailsettingsEle, "emailsettings link");
		Thread.sleep(5000);

		WebElement emailnameEle = driver.findElement(By.id("sender_name"));
		enterText(emailnameEle, "Rupal ABCD", "emailname");

		WebElement emailidEle = driver.findElement(By.id("sender_email"));
		enterText(emailidEle, "rupal.soni.sqa@gmail.com", "emailid");

		WebElement automaticbccEle = driver.findElement(By.id("auto_bcc1"));
		clickElement(automaticbccEle, "radio btn");

		WebElement saveEle = driver.findElement(By.name("save"));
		clickElement(saveEle, "save btn");

		WebElement calendarlinkEle = driver.findElement(By.id("CalendarAndReminders_font"));
		clickElement(calendarlinkEle, "email link");
		Thread.sleep(5000);

		WebElement activityreminderlinkEle = driver.findElement(By.id("Reminders_font"));
		clickElement(activityreminderlinkEle, "email link");
		Thread.sleep(5000);

		WebElement testreminderbtnEle = driver.findElement(By.id("testbtn"));
		clickElement(testreminderbtnEle, "email link");
		Thread.sleep(5000);
		closeDriver();
	}
	
	@Test
	public void DevelopersConsole_Usermenu_dropdown() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

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

		WebElement usermenuEle = driver.findElement(By.id("userNavLabel"));
		clickElement(usermenuEle, "usermenu dropdown");

		WebElement developerconsoleEle = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[3]"));
		clickElement(developerconsoleEle, "developer console");

		closeDriver();

	}
	@Test
	public void Logout_Usermenu_dropdown() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

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

		WebElement usermenuEle = driver.findElement(By.id("userNavLabel"));
		clickElement(usermenuEle, "usermenu dropdown");

		WebElement logoutEle = driver.findElement(By.className("menuButtonMenuLink"));
		clickElement(logoutEle, "logout option");

		closeDriver();

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		UserMenuDropDownTests ob = new UserMenuDropDownTests();

		//ob.Usermenu_dropdown();
		//ob.MyProfile_Usermenu_dropdown();
		//ob.MySetting_Usermenu_dropdown();
		//ob.DevelopersConsole_Usermenu_dropdown();
		ob.Logout_Usermenu_dropdown();
	}
}
