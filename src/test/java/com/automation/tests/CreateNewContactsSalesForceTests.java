package com.automation.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automation.base.BaseFirebase;

public class CreateNewContactsSalesForceTests extends BaseFirebase {

	private Logger mylog = LogManager.getLogger(UserMenuDropDownTests.class);
	
	@Test
	public void Create_NewContact() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement contactTabEle = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
		clickElement(contactTabEle, "contact tab");
		Thread.sleep(5000);

		WebElement newEle = driver.findElement(By.name("new"));
		clickElement(newEle, "new button");

		WebElement lastnameEle = driver.findElement(By.id("name_lastcon2"));
		enterText(lastnameEle, "soni", "lastname");

		WebElement accountnameEle = driver.findElement(By.id("con4"));
		enterText(accountnameEle, "xyz", "account name");

		WebElement saveEle = driver.findElement(By.name("save"));
		clickElement(saveEle, "save button");
		Thread.sleep(2000);

		closeDriver();
	}
	@Test
	public void Create_NewviewContact() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement contactTabEle = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
		clickElement(contactTabEle, "contact tab");
		Thread.sleep(5000);

		WebElement createnewviewEle = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
		clickElement(createnewviewEle, "create newview");

		WebElement viewnameEle = driver.findElement(By.id("fname"));
		enterText(viewnameEle, "soni", "viewname");

		WebElement viewuniqueameEle = driver.findElement(By.id("devname"));
		enterText(viewuniqueameEle, "soni", "lastname");

		WebElement saveEle = driver.findElement(By.name("save"));
		clickElement(saveEle, "save button");
		Thread.sleep(2000);

		closeDriver();

	}
	@Test
	public void Created_Contact() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement contactTabEle = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
		clickElement(contactTabEle, "contact tab");
		Thread.sleep(5000);

		WebElement recentdd = driver.findElement(By.id("hotlist_mode"));
		Select select = new Select(recentdd);
		select.selectByIndex(0);
		Thread.sleep(2000);

		closeDriver();

	}
	@Test
	public void My_ContactsView() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement contactTabEle = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
		clickElement(contactTabEle, "contact tab");
		Thread.sleep(5000);

		WebElement viewdd = driver.findElement(By.id("fcf"));
		Select select = new Select(viewdd);
		select.selectByIndex(4);
		Thread.sleep(2000);

		closeDriver();

	}
	@Test
	public void View_Contactpage() throws InterruptedException {

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

		WebElement contactTabEle = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
		clickElement(contactTabEle, "contact tab");
		Thread.sleep(5000);

		WebElement creatnewviewlinkEle = driver
				.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
		clickElement(creatnewviewlinkEle, "creatnewviewlink tab");
		Thread.sleep(5000);

		WebElement viewnameEle = driver.findElement(By.id("fname"));
		enterText(viewnameEle, "ABCD", "viewname");

		WebElement viewuniquenameEle = driver.findElement(By.id("devname"));
		enterText(viewuniquenameEle, "xyz", "viewuniquename");

		WebElement saveEle = driver.findElement(By.name("save"));
		clickElement(saveEle, "save button");
		Thread.sleep(2000);

		closeDriver();

	}
	@Test
	public void Recently_Createdcontact() throws InterruptedException {

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

		WebElement contactTabEle = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
		clickElement(contactTabEle, "contact tab");
		Thread.sleep(5000);

		WebElement viewdd = driver.findElement(By.id("hotlist_mode"));
		Select select = new Select(viewdd);
		select.selectByIndex(0);
		Thread.sleep(2000);

		closeDriver();

	}
	@Test
	public void MyContacts_View() throws InterruptedException {

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

		WebElement contactTabEle = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
		clickElement(contactTabEle, "contact tab");
		Thread.sleep(5000);

		WebElement contactpagedd = driver.findElement(By.id("fcf"));
		Select select = new Select(contactpagedd);
		select.selectByIndex(5);
		Thread.sleep(2000);

		closeDriver();
	}
	@Test
	public void MyContacts_CreatViewErrormessage() throws InterruptedException {

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

		WebElement contactTabEle = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
		clickElement(contactTabEle, "contact tab");
		Thread.sleep(5000);

		WebElement creatnewviewlinkEle = driver
				.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
		clickElement(creatnewviewlinkEle, "creatnewviewlink tab");
		Thread.sleep(5000);

		WebElement viewuniquenameEle = driver.findElement(By.id("devname"));
		enterText(viewuniquenameEle, "EFGH", "viewuniquename");

		WebElement saveEle = driver.findElement(By.name("save"));
		clickElement(saveEle, "save button");
		Thread.sleep(2000);

		closeDriver();
	}
	@Test
	public void CreateNewView_Cancelbtn() throws InterruptedException {

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

		WebElement contactTabEle = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
		clickElement(contactTabEle, "contact tab");
		Thread.sleep(5000);

		WebElement creatnewviewlinkEle = driver
				.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
		clickElement(creatnewviewlinkEle, "creatnewviewlink tab");
		Thread.sleep(5000);

		WebElement viewnameEle = driver.findElement(By.id("fname"));
		enterText(viewnameEle, "ABCD", "viewname");

		WebElement viewuniquenameEle = driver.findElement(By.id("devname"));
		enterText(viewuniquenameEle, "EFGH", "viewuniquename");

		WebElement cancelEle = driver.findElement(By.name("cancel"));
		clickElement(cancelEle, "cancel button");
		Thread.sleep(2000);

		closeDriver();

	}
	@Test
	public void Validate_SaveandNew_Button() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.name("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.name("pw"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		WebElement contactTabEle = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
		clickElement(contactTabEle, "contact tab");
		Thread.sleep(5000);

		WebElement newEle = driver.findElement(By.name("new"));
		clickElement(newEle, "new tab");
		Thread.sleep(5000);

		WebElement lastnameEle = driver.findElement(By.name("name_lastcon2"));
		enterText(lastnameEle, "indian", "lastname");

		WebElement accountnameEle = driver.findElement(By.name("con4"));
		enterText(accountnameEle, "Global Media", "account name");

		WebElement saveandnewEle = driver.findElement(By.name("save_new"));
		clickElement(saveandnewEle, "saveandnew button");
		Thread.sleep(2000);

		closeDriver();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		CreateNewContactsSalesForceTests ob = new CreateNewContactsSalesForceTests ();

		//ob.Create_NewContact();
		//ob.Create_NewviewContact();
		ob.Created_Contact();
		ob.My_ContactsView();
		ob.MyContacts_View();
		ob.View_Contactpage();
		ob.Recently_Createdcontact();
		ob.MyContacts_CreatViewErrormessage();
		ob.CreateNewView_Cancelbtn();
		ob.Validate_SaveandNew_Button();
	}
}
