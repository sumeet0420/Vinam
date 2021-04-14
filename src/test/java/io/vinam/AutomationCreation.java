package io.vinam;

import io.vinam.base.TestBase;
import io.vinam.webpages.ScreenShotUtility;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class AutomationCreation extends TestBase {
	
	 @Test(dataProvider = "data")
	public void Automation(String name) throws InterruptedException {
	
	login.enterEmail(properties.getProperty("EmailID"));
	log.info("Email id  entered");
	login.enterPassword(properties.getProperty("Password"));
	log.info("Password  entered");
	login.clickLoginButton();
	log.info("Clicked on login button");
	ScreenShotUtility.takeScreenShot(driver);
	//board.verifyPageName();
	ScreenShotUtility.takeScreenShot(driver); 
	log.info("Dashboard page verified");
	board.clickAutomationLink();
	ScreenShotUtility.takeScreenShot(driver);
	log.info("Clicked on Automation link");
	automation.clickOnCreateButton();
	log.info("Clicked on create button");
	Thread.sleep(3000);
	automation.verifyPageName();
	ScreenShotUtility.takeScreenShot(driver);
	log.info("Page verified");
    automation.enterName(name); 
    ScreenShotUtility.takeScreenShot(driver);
    log.info("Name Entered");
    automation.clickChoseTarget();
    log.info("Click on chose target");
    ScreenShotUtility.takeScreenShot(driver);
    automation.verifyChoseTarget();
    ScreenShotUtility.takeScreenShot(driver);
    log.info("Chose target page verified");
    Thread.sleep(2000);
    automation.clickOptionFromList();
    ScreenShotUtility.takeScreenShot(driver);
    log.info("Select from list");
    automation.clickContinueButton();
    Thread.sleep(2000);
    log.info("Click on continue button");
    automation.clickEndDate();
    ScreenShotUtility.takeScreenShot(driver);
    log.info("select end date");
    automation.clickContinue();
		 
	}
	 @DataProvider(name = "data")
		public Object[][] data() {
	    	return new String[][]{{"nathe"}};
		}
	
}
