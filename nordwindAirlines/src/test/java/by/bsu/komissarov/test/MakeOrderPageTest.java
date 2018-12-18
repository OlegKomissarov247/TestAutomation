package by.bsu.komissarov.test;

import by.bsu.komissarov.driver.DriverProvider;
import by.bsu.komissarov.page.MakeOrderPage;
import by.bsu.komissarov.page.MainPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MakeOrderPageTest {

    private MainPage mainPage;
    private MakeOrderPage makeOrderPage;

    @BeforeMethod
    public void openWebPage() {
        DriverProvider.getDriver().get("https://nordwindairlines.ru/");
        mainPage = new MainPage();
        makeOrderPage = new MakeOrderPage();
    }

    @Test
    public void checkBusinessClassSeatsBlock() {
        mainPage.openServicesSubmenu();
        mainPage.goToMakeOrderPage();
        Assert.assertTrue(makeOrderPage.isChildrenCountLabelPresent());
    }

    @AfterMethod
    public void closeDriver() {
        DriverProvider.closeDriver();
    }
}
