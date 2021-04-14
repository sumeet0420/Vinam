package io.vinam.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class AutomationPage {

    private static final DateTimeFormatter DATE_FORMAT_CALENDAR = DateTimeFormatter.ofPattern("MMM yyyy dd");

    private WebDriver driver;
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

    @FindBys(@FindBy(how = How.XPATH, using = "//span[@class='day__month_btn up']/following-sibling::span"))
    private List<WebElement> calendarNextArrows;
    @FindBys(@FindBy(how = How.XPATH, using = "//div[@class='vdp-datepicker cstm_inline']"))
    private List<WebElement> calendars;

    public AutomationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(Name));
        Name.sendKeys(name);
    }

    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickChoseTarget() {
        ChoseTarget.click();
    }

    public void verifyChoseTarget() {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfAllElements((ChoseYourTarget)));

    }

    public void clickOptionFromList() {
        ((JavascriptExecutor) (driver)).executeScript("document.querySelector('label.custom-control-label', ':after').click();");
    }

    public void clickContinueButton() {
        SelectContinue.click();
    }

    public void clickStartDate(String date) {
        final WebElement endDate = calendars.get(0);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", endDate);
        endDate.click();
        LocalDate dateToCheck = LocalDate.from(DATE_FORMAT_CALENDAR.parse(date));
        LocalDate tempCurrentDate = LocalDate.now().withDayOfMonth(1);
        long noOfMonths = ChronoUnit.MONTHS.between(tempCurrentDate, dateToCheck);
        for (int i = 0; i < noOfMonths; i++) {
            calendarNextArrows.get(0).click();
        }
        driver.findElements(By.xpath("//span[contains(@class,'cell day')  and text()='" + dateToCheck.getDayOfMonth() + "']")).get(0).click();
    }

    public void clickEndDate(String date) {
        final WebElement endDate = calendars.get(1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", endDate);
        endDate.click();
        LocalDate dateToCheck = LocalDate.from(DATE_FORMAT_CALENDAR.parse(date));
        LocalDate tempCurrentDate = LocalDate.now().withDayOfMonth(1);
        long noOfMonths = ChronoUnit.MONTHS.between(tempCurrentDate, dateToCheck);
        for (int i = 0; i < noOfMonths; i++) {
            calendarNextArrows.get(1).click();
        }
        driver.findElements(By.xpath("//span[contains(@class,'cell day')  and text()='" + dateToCheck.getDayOfMonth() + "']")).get(1).click();
    }

    public void clickContinue() {
        ClickContinue.click();
    }
}
