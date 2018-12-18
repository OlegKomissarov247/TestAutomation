package by.bsu.komissarov.test;

import by.bsu.komissarov.driver.DriverProvider;
import by.bsu.komissarov.page.MainPage;
import by.bsu.komissarov.page.OrderManagePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderManagePageTest {

    private MainPage mainPage;
    private OrderManagePage orderManagePage;

    @BeforeMethod
    public void openWebPage() {
        DriverProvider.getDriver().get("https://nordwindairlines.ru/");
        mainPage = new MainPage();
        orderManagePage = new OrderManagePage();
    }

    @Test
    public void checkOrderManagePage() {
        mainPage.openInfoSubmenu();
        mainPage.goToOrderManagePage();
        Assert.assertTrue(orderManagePage.isGeoWarningModalPresent());
    }

    @AfterMethod
    public void closeDriver() {
        DriverProvider.closeDriver();
    }
}
