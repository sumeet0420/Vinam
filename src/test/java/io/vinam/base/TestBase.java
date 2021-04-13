package io.vinam.base;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import io.vinam.webpages.AutomationPage;
import io.vinam.webpages.DashBoardPage;
import io.vinam.webpages.LoginPage;
import io.vinam.webpages.PropertiesUtiles;

public class TestBase {


	  public static WebDriver driver;
	  protected LoginPage login;
	  protected DashBoardPage board;
	  protected AutomationPage automation;
	  protected Properties properties;
	  @BeforeSuite
	  public void setUp() throws IOException {
		   
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\Season3\\chromedriver.exe");
		  driver = new ChromeDriver();
		  login = new LoginPage(driver);
		  board = new DashBoardPage(driver);
		  automation = new  AutomationPage(driver);
		  properties = PropertiesUtiles.loadPropertiesFile();
		  
		  driver.get(properties.getProperty("Url"));
		  login = PageFactory.initElements(driver, LoginPage.class);
		 
	  }
}
