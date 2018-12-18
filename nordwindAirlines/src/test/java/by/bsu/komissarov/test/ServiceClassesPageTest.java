package by.bsu.komissarov.test;

import by.bsu.komissarov.driver.DriverProvider;
import by.bsu.komissarov.page.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ServiceClassesPageTest {

    private MainPage mainPage;
    private ServiceClassesPage serviceClassesPage;

    @BeforeMethod
    public void openWebPage() {
        DriverProvider.getDriver().get("https://nordwindairlines.ru/");
        mainPage = new MainPage();
        serviceClassesPage = new ServiceClassesPage();
    }

    @Test
    public void checkServiceClassesPage() {
        mainPage.openInfoSubmenu();
        mainPage.goToServiceClassesPage();
        Assert.assertTrue(serviceClassesPage.isServiceClassesPagePresent());
    }

    @AfterMethod
    public void closeDriver() {
        DriverProvider.closeDriver();
    }
}
