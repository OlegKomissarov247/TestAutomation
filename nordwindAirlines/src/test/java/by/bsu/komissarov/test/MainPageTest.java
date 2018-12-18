package by.bsu.komissarov.test;

import by.bsu.komissarov.driver.DriverProvider;
import by.bsu.komissarov.page.MainPage;
import by.bsu.komissarov.page.BaggageAllowancePage;
import by.bsu.komissarov.page.ChooseSeatPage;
import by.bsu.komissarov.page.MakeOrderPage;
import by.bsu.komissarov.page.OrderManagePage;
import by.bsu.komissarov.page.ServiceClassesPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.tools.jar.Main;

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

        Assert.assertTrue(mainPage.isBackDatePickerInputHidden());
    }

    @Test
    public void checkTwoWayButton() {
        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isBackDatePickerInputPresent());
    }

    @Test
    public void checkGeoWarningModal() {
        OrderManagePage orderManagePage = new OrderManagePage();

        Assert.assertTrue(orderManagePage.isGeoWarningModalPresent());
    }

    @Test
    public void checkBaggageAllowanceModal() {
        BaggageAllowancePage baggageAllowancePage = new BaggageAllowancePage();

        Assert.assertTrue(baggageAllowancePage.isBaggageAllowanceModalPresent());
    }

    @Test
    public void checkOrderTicketChildrenInput() {
        MakeOrderPage makeOrderPage = new MakeOrderPage();

        Assert.assertTrue(makeOrderPage.isChildrenCountLabelPresent());
    }



    @AfterMethod
    public void closeDriver() {
        DriverProvider.closeDriver();
    }
}
