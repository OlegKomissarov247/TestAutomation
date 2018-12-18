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
    public void checkAvailabilityOfPrevMonthButton() {
        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.IsPrevMonthDisabledPresent());
    }

    @Test
    public void checkAdultsNumberInput() {
        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isAddAdultButtonDisabledPresent());
    }

    @Test
    public void checkEnglishLanguageSwitcher() {
        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isEnglishPlaceholderPresent());
    }

    @Test
    public void checkOneWayButton() {
        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isBackDatePickerInputPresent());
    }

    @Test
    public void checkGeoWarningModal() {
        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isGeoWarningModalPresent());
    }

    @Test
    public void checkBaggageAllowanceModal() {
        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isBaggageAllowanceModalPresent());
    }

    @Test
    public void checkOrderTicketChildrenInput() {
        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isChildrenCountLabelPresent());
    }

    @Test
    public void checkBusinessClassSeatsBlock() {
        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isBusinessClassSeatsBlockPresent());
    }

    @AfterMethod
    public void closeDriver() {
        DriverProvider.closeDriver();
    }
}
