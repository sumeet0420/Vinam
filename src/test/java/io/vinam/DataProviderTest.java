package io.vinam;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void hello(String name) {
        System.out.println(name);
    }

    @DataProvider(name = "data")
    public Object[][] data() {
        return new String[][]{{"nathe"}};
    }
}