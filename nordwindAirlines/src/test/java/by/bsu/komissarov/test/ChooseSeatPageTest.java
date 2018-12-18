package by.bsu.komissarov.test;

import by.bsu.komissarov.driver.DriverProvider;
import by.bsu.komissarov.page.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChooseSeatPageTest {

    private MainPage mainPage;
    private ChooseSeatPage chooseSeatPage;

    @BeforeMethod
    public void openWebPage() {
        DriverProvider.getDriver().get("https://nordwindairlines.ru/");
        mainPage = new MainPage();
        chooseSeatPage = new ChooseSeatPage();
    }

    @Test
    public void checkBusinessClassSeatsBlock() {
        mainPage.openServicesSubmenu();
        mainPage.goToChooseSeatPage();
        Assert.assertTrue(chooseSeatPage.isBusinessClassSeatsBlockPresent());
    }

    @AfterMethod
    public void closeDriver() {
        DriverProvider.closeDriver();
    }
}
