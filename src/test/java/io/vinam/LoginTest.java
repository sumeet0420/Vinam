package io.vinam;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import io.vinam.base.TestBase;
import io.vinam.webpages.DashBoardPage;
import io.vinam.webpages.LoginPage;
import io.vinam.webpages.ScreenShotUtility;

@Test
public class LoginTest extends TestBase{

	DashBoardPage board = PageFactory.initElements(driver, DashBoardPage.class);
	public void login() throws InterruptedException {
		
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
