package by.bsu.komissarov.test;

import by.bsu.komissarov.driver.DriverProvider;
import by.bsu.komissarov.page.MainPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTest {

    @BeforeMethod
    public void openWebPage() {
        DriverProvider.getDriver().get("https://nordwindairlines.ru/");
    }

    @Test
    public void checkAvailabilityOfDates() {
        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.IsDateDisabledPresent());
    }

    @Test
    public void checkAdultsNumberInput() {
        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isAddAdultButtonDisabledPresent());
    }

    @AfterMethod
    public void closeDriver() {
        DriverProvider.closeDriver();
    }
}
