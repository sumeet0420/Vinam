package io.vinam.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPage {

	WebDriver driver;
	@FindBy(how = How.XPATH, using = "//*[text()='Create automation']") 
	private WebElement CreateButton;
	@FindBy(how = How.XPATH, using = "//*[@class='col-auto']/*[@class='font-28 font-head breadcrumbs-title']") 
	private WebElement CreateAutomation;
	@FindBy(how = How.ID, using = "name") 
	private WebElement Name;
	@FindBy(how = How.XPATH, using = "//*[text()='Choose your target']") 
	private WebElement ChoseTarget;
	@FindBy(how = How.XPATH, using = "//*[text()=' Choose your target ']") 
	private WebElement ChoseYourTarget;
	@FindBy(how = How.CSS, using = "label.custom-control-label:after") 
	private WebElement SelectOption;
	@FindBy(how = How.XPATH, using = "//*[@class='btn btn-primary']") 
	private WebElement SelectContinue;
	@FindBy(how = How.XPATH, using = "//div[@name='end date']") 
	private WebElement SelectEndDate;
	@FindBy(how = How.XPATH, using = "//*[@class='cell day'][6]") 
	private WebElement ClickDate;
	@FindBy(how = How.XPATH, using = "//*[@class='btn btnw-170 btn-primary']") 
	private WebElement ClickContinue;

	public AutomationPage(WebDriver driver){
		this.driver = driver;
	  PageFactory.initElements(driver,this);
	}
	public void clickOnCreateButton() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(CreateButton));
		CreateButton.click();
	}
	public void verifyPageName() {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(CreateAutomation));			
	}
	public void enterName(String name) {
		
		Name.sendKeys(name);
	}
	public void clickChoseTarget() {
		ChoseTarget.click();
	}
	public void verifyChoseTarget() {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements((ChoseYourTarget)));			
		
   }
	public void clickOptionFromList() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		((JavascriptExecutor) (driver)).executeScript("document.querySelector('label.custom-control-label', ':after').click();");
		
		//SelectOption.click();
		
	}
	public void clickContinueButton() {
		SelectContinue.click();
		
	}
	public void clickEndDate() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(SelectEndDate));
		SelectEndDate.click();
		
	}
	public void selectDate(){
		
		  Actions action = new Actions(driver); 
		  action.moveToElement(ClickDate); 
		  action.click().build().perform();
		 
	}
	public void clickContinue() {
		
		ClickContinue.click();
		
	}
	
}
