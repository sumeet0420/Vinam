package io.vinam;

import io.vinam.webpages.ExcelUtils;
import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "loginDetails")
    public static Object[][] getLoginDetails() throws Exception {
        return ExcelUtils.readExcelData("AutomationCreation", "Sheet2");
    }

    @DataProvider(name = "data")
    public static Object[][] data() throws Exception {
//        return ExcelUtils.readExcelData("AutomationCreation", "Sheet1");
        return new String[][]{{"nathe"}};
    }
}