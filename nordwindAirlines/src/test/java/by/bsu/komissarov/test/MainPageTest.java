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

    @Test
    public void checkBusinessClassSeatsBlock() {
        ChooseSeatPage chooseSeatPage = new ChooseSeatPage();

        Assert.assertTrue(chooseSeatPage.isBusinessClassSeatsBlockPresent());
    }

    @Test
    public void checkServiceClassesPage() {
        ServiceClassesPage serviceClassesPage = new ServiceClassesPage();

        Assert.assertTrue(serviceClassesPage.isServiceClassesPagePresent());
    }

    @AfterMethod
    public void closeDriver() {
        DriverProvider.closeDriver();
    }
}
