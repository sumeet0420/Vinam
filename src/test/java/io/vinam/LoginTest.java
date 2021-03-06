package io.vinam;

import io.vinam.base.TestBase;
import io.vinam.webpages.ExcelUtils;
import io.vinam.webpages.ScreenShotUtility;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

    @Test(dataProvider = "loginDetails", dataProviderClass = DataProviders.class)
    public void login(String userName, String password) throws InterruptedException {
        login.enterEmail(properties.getProperty("EmailID"));
        ScreenShotUtility.takeScreenShot(driver);
        log.info("Email id  entered");
        login.enterPassword(properties.getProperty("Password"));
        ScreenShotUtility.takeScreenShot(driver);
        log.info("Password entered");
        login.clickLoginButton();
        ScreenShotUtility.takeScreenShot(driver);
        log.info("Successfully clicked on login button");
        //board.verifyPageName();
        ScreenShotUtility.takeScreenShot(driver);
    }

}
