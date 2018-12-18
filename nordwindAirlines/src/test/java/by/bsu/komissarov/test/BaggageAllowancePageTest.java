package by.bsu.komissarov.test;

import by.bsu.komissarov.driver.DriverProvider;
import by.bsu.komissarov.page.MainPage;
import by.bsu.komissarov.page.BaggageAllowancePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaggageAllowancePageTest {

    private MainPage mainPage;
    private BaggageAllowancePage baggageAllowancePage;

    @BeforeMethod
    public void openWebPage() {
        DriverProvider.getDriver().get("https://nordwindairlines.ru/");
        mainPage = new MainPage();
        baggageAllowancePage = new BaggageAllowancePage();
    }

    @Test
    public void checkBaggageAllowancePage() {
        mainPage.openServicesSubmenu();
        mainPage.goToBaggageAllowancePage();
        Assert.assertTrue(baggageAllowancePage.isBaggageAllowanceModalPresent());
    }

    @AfterMethod
    public void closeDriver() {
        DriverProvider.closeDriver();
    }
}
