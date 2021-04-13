package io.vinam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.vinam.base.TestBase;
import io.vinam.webpages.AutomationPage;
import io.vinam.webpages.DashBoardPage;
import io.vinam.webpages.LoginPage;
import io.vinam.webpages.ScreenShotUtility;

@Test
public class AutomationCreation extends TestBase {
	
	
	public void Automation() throws InterruptedException {
	
	login.enterEmail(properties.getProperty("EmailID"));
	login.enterPassword(properties.getProperty("Password"));
	login.clickLoginButton();
	ScreenShotUtility.takeScreenShot(driver);
	board.verifyPageName();
	ScreenShotUtility.takeScreenShot(driver);
	board.clickAutomationLink();
	ScreenShotUtility.takeScreenShot(driver);
	automation.clickOnCreateButton();
	Thread.sleep(3000);
	automation.verifyPageName();
	ScreenShotUtility.takeScreenShot(driver);
    automation.enterName("nathe"); 
    ScreenShotUtility.takeScreenShot(driver);
    automation.clickChoseTarget();
    ScreenShotUtility.takeScreenShot(driver);
    automation.verifyChoseTarget();
    ScreenShotUtility.takeScreenShot(driver);
    Thread.sleep(3000);
   // automation.clickOptionFromList();
   // automation.clickContinueButton();
		 
	}
	
}
