package io.vinam;

import io.vinam.base.TestBase;
import io.vinam.webpages.ScreenShotUtility;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class AutomationCreation extends TestBase {


    @Test(dataProvider = "data")
    public void Automation(String name) throws InterruptedException {
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
        automation.enterName(name);
        ScreenShotUtility.takeScreenShot(driver);
        automation.clickChoseTarget();
        ScreenShotUtility.takeScreenShot(driver);
        automation.verifyChoseTarget();
        ScreenShotUtility.takeScreenShot(driver);
        Thread.sleep(3000);
        // automation.clickOptionFromList();
        // automation.clickContinueButton();

    }


	@DataProvider(name = "data")
	public Object[][] data() {
    	return new String[][]{{"nathe"}};
	}
}
