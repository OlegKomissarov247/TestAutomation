package by.bsu.komissarov.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Page {

    private static final int MAX_ADULTS_AMOUNT = 9;

    private static final By ChooseSeatLink = By.xpath("//span[@class=\"el-menu-link__text\"][contains(text(), \"Выбор места в самолете\")]");

    private static final By ServiceClassesLink = By.xpath("//span[@class=\"el-menu-link__text\"][contains(text(), \"Классы обслуживания\")]");

    private static final By BaggageAllowanceInfoLink = By.xpath("//span[@class=\"el-menu-link__text\"][contains(text(), \"Выбор места в самолёте\")]");

    private static final By MakeOrderLink = By.xpath("//span[@class=\"el-menu-link__text\"][contains(text(), \"Купить билет\")]");

    private static final By OrderManageLink = By.xpath("//span[@class=\"el-menu-link__text\"][contains(text(), \"Управление заказом\")]");

    @FindBy(xpath = "//div[@class=\"el-submenu__title\"][contains(text(), \"Услуги\")]")
    private WebElement serviceSubmenuButton;

    @FindBy(xpath = "//span[contains(text(), \"Только туда\")]")
    private WebElement oneWayButton;

    @FindBy(xpath = "//span[contains(text(), \"Туда и обратно\")]")
    private WebElement twoWayButton;

    @FindBy(xpath = "//div[@class = \"search-form__field search-form__field_date-arrival js-date-to-container field_hidden\"]//input[contains(@placeholder, \"Вылет обратно\")]")
    private WebElement datePickerBackInputHidden;

    @FindBy(xpath = "//div[@class = \"search-form__field search-form__field_date-arrival js-date-to-container field_active\"]//input[contains(@placeholder, \"Вылет обратно\")]")
    private WebElement datePickerBackInputActive;

    @FindBy(xpath = "//input[contains(@placeholder, \"Вылет туда\")]")
    private WebElement datePickerInput;

    @FindBy(xpath = "//input[contains(@placeholder, \"Arrival date\")]")
    private WebElement englishDatepickerPlaceholder;

    @FindBy(xpath = "//span[@class = \"lang-switcher header-desktop__control\"]")
    private WebElement langSwitcher;

    @FindBy(xpath = "//a[contains(text(), \"EN\")]")
    private WebElement englishLanguageButton;

    @FindBy(xpath = "//h1[contains(text(), \"Лучшие предложения\")]")
    private WebElement subHeader;

    @FindBy(xpath = "//div[@class=\"el-submenu__title\"][contains(text(), \"информация\")]")
    private WebElement infoSubmenuButton;

    @FindBy(xpath = "//a[@class = \"ui-datepicker-prev ui-corner-all ui-state-disabled\"]")
    private WebElement prevMonth;

    @FindBy(xpath = "//input[@data-type = \"adults\"]")
    private WebElement adultsInput;

    @FindBy(xpath = "//button[@disabled=\"disabled\"]/svg[@class = \"search-form__icon-arrow_right\"]")
    private WebElement addAdultButtonDisabled;

    public void openServicesSubmenu() {
        serviceSubmenuButton.click();
    }

    public void openInfoSubmenu() {
        infoSubmenuButton.click();
    }

    public void goToChooseSeatPage() {
        driver.findElement(ChooseSeatLink).click();
    }

    public void goToServiceClassesPage() {
        driver.findElement(ServiceClassesLink).click();
    }

    public void goToMakeOrderPage() {
        driver.findElement(MakeOrderLink).click();
    }

    public void goToOrderManagePage() {
        driver.findElement(OrderManageLink).click();
    }

    public void goToBaggageAllowancePage() {
        driver.findElement(BaggageAllowanceInfoLink).click();
    }

    private void chooseOneWayTicketType() {
        new Actions(driver).click(oneWayButton).perform();
    }

    private void fillAdultsInput() {
        adultsInput.clear();
        adultsInput.sendKeys(String.valueOf(MAX_ADULTS_AMOUNT));
    }

    public boolean IsPrevMonthDisabledPresent() {
        datePickerInput.click();
        return prevMonth.isEnabled();
    }

    public boolean isAddAdultButtonDisabledPresent() {
        fillAdultsInput();
        subHeader.click();
        return addAdultButtonDisabled.isEnabled();
    }

    public boolean isEnglishPlaceholderPresent() {
        langSwitcher.click();
        englishLanguageButton.click();
        return englishDatepickerPlaceholder.isEnabled();
    }

    public boolean isBackDatePickerInputHidden() {
        chooseOneWayTicketType();
        return datePickerBackInputHidden.isEnabled();
    }

    public boolean isBackDatePickerInputPresent() {
        chooseOneWayTicketType();
        new Actions(driver).click(twoWayButton).perform();
        return datePickerBackInputActive.isEnabled();
    }
}
