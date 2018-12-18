package by.bsu.komissarov.test;

import by.bsu.komissarov.driver.DriverProvider;
import by.bsu.komissarov.page.MainPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTest {

    private MainPage mainPage;
    @BeforeMethod
    public void openWebPage() {
        DriverProvider.getDriver().get("https://nordwindairlines.ru/");
        mainPage = new MainPage();
    }

    @Test
    public void checkAvailabilityOfPrevMonthButton() {
        Assert.assertTrue(mainPage.IsPrevMonthDisabledPresent());
    }

    @Test
    public void checkAdultsNumberInput() {
        Assert.assertTrue(mainPage.isAddAdultButtonDisabledPresent());
    }

    @Test
    public void checkEnglishLanguageSwitcher() {
        Assert.assertTrue(mainPage.isEnglishPlaceholderPresent());
    }

    @Test
    public void checkOneWayButton() {
        Assert.assertTrue(mainPage.isBackDatePickerInputHidden());
    }

    @Test
    public void checkTwoWayButton() {
        Assert.assertTrue(mainPage.isBackDatePickerInputPresent());
    }

    @AfterMethod
    public void closeDriver() {
        DriverProvider.closeDriver();
    }
}
