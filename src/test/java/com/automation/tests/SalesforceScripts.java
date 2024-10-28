package com.automation.tests;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.automation.base.BaseFirebase;

public class SalesforceScripts extends BaseFirebase {

	// TODO Auto-generated method stub

	public void SalesForce_loginErrorMessage() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.id("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.id("password"));
		if (passwordEle.isDisplayed()) {
			passwordEle.clear();
		} else {
			System.out.println("password textbox is not displayed");
		}
		System.out.println("Please enter your password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

	}

	public void SalesForce_login() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement usernameEle = driver.findElement(By.id("username"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle, "Kartey@2024", "password");

		WebElement buttonEle = driver.findElement(By.id("Login"));
		clickElement(buttonEle, "login button");
		Thread.sleep(5000);

		closeDriver();
	}

	public void Check_RememberMe() throws InterruptedException {

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

		WebElement logoutEle = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		clickElement(logoutEle, "logout button");

		Thread.sleep(5000);

		closeDriver();

	}

	public void Forgot_Password() throws InterruptedException {

		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/");

		WebElement forgotpasswordEle = driver.findElement(By.id("forgot_password_link"));
		clickElement(forgotpasswordEle, "forgotpassword link");

		WebElement usernameEle = driver.findElement(By.id("un"));
		enterText(usernameEle, "rupal@tekarch.com", "username");

		WebElement buttonEle = driver.findElement(By.id("continue"));
		clickElement(buttonEle, "continue button");
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

		WebElement usermenuEle = driver.findElement(By.id("userNavLabel"));
		clickElement(usermenuEle, "usermenu dropdown");

		closeDriver();
	}

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

		WebElement aboutEle = driver.findElement(By.id("aboutTab"));
		clickElement(aboutEle, "about tab");
		Thread.sleep(5000);

		closeDriver();

	}

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
		System.out.println("Number of options in a drop down:" + options.size());

		closeDriver();

	}

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

		SalesforceScripts ob = new SalesforceScripts();

		ob.SalesForce_loginErrorMessage();
		// ob.SalesForce_login();
		// ob.Check_RememberMe();
		// ob. Forgot_Password();
		// ob.ValidateLoginError_Message();//*[@id="aboutTab"]/a
		// ob.Usermenu_dropdown();
		// ob.MyProfile_Usermenu_dropdown();
		// ob.MySetting_Usermenu_dropdown();
		// ob.DevelopersConsole_Usermenu_dropdown();
		// ob.Logout_Usermenu_dropdown();
		// ob.Create_Account();
		// ob.Create_View();
		// ob.Edit_View();
		// ob.MergeAccounts_View();
		// ob.CreateAccounts_Report();
		// ob.opportunities_dropdown();
		// ob.Create_Newopportunities();
		// ob.Test_Opportunitypipeline_Report();
		// ob.Test_Stuck_Opportunity_Report();
		// ob.Testquaterly_Summary_Report();
		// ob.Leads_Tab();
		// ob.Leads_SelectView();
		// ob.Default_View();
		// ob.Create_NewContact();
		// ob.Create_NewviewContact();
		// ob.Created_Contact();
		// ob.My_ContactsView();
		// ob.View_Contactpage();
		// ob.Recently_Createdcontact();
		// ob.MyContacts_View();
		// ob.MyContacts_CreatViewErrormessage();
		// ob.CreateNewView_Cancelbtn();
		// ob.Validate_SaveandNew_Button();
		// ob.Validate_FirstandLastName();
		// ob.Validate_EditedLastName();
		ob.Validate_Alltab();
	}

}
