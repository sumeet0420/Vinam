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
        login.enterPassword(properties.getProperty("Password"));
        ScreenShotUtility.takeScreenShot(driver);
		login.clickLoginButton();
		ScreenShotUtility.takeScreenShot(driver);
		board.verifyPageName();
		ScreenShotUtility.takeScreenShot(driver);
				
		
	}
}
