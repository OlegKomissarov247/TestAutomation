package by.bsu.komissarov.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Page {

    private static final int MAX_ADULTS_AMOUNT = 9;

    @FindBy(xpath = "//div[@class=\"el-submenu__title\"][contains(text(), \"Услуги\")]")
    private WebElement serviceSubmenuButton;

    @FindBy(xpath = "//span[@class=\"el-menu-link__text\"][contains(text(), \"Выбор места в самолете\")]")
    private WebElement chooseSeatLink;

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

    @FindBy(xpath = "//a[@class = \"ui-datepicker-prev ui-corner-all ui-state-disabled\"]")
    private WebElement prevMonth;

    @FindBy(xpath = "//input[@data-type = \"adults\"]")
    private WebElement adultsInput;

    @FindBy(xpath = "//button[@disabled=\"disabled\"]/svg[@class = \"search-form__icon-arrow_right\"]")
    private WebElement addAdultButtonDisabled;

    @FindBy(xpath = "//div[@class=\"el-submenu__title\"][contains(text(), \"информация\")]")
    private WebElement infoSubmenuButton;

    @FindBy(xpath = "//span[@class=\"el-menu-link__text\"][contains(text(), \"Классы обслуживания\")]")
    private WebElement serviceClassesLink;

    @FindBy(xpath = "//span[@class=\"el-menu-link__text\"][contains(text(), \"Выбор места в самолёте\")]")
    private WebElement baggageAllowanceInfoLink;

    @FindBy(xpath = "//span[@class=\"el-menu-link__text\"][contains(text(), \"Управление заказом\")]")
    private WebElement orderManageLink;

    @FindBy(xpath = "//span[@class=\"el-menu-link__text\"][contains(text(), \"Купить билет\")]")
    private WebElement makeOrderLink;

    public void openServicesSubmenu() {
        serviceSubmenuButton.click();
    }

    public void openInfoSubmenu() {
        infoSubmenuButton.click();
    }

    public void goToChooseSeatPage() {
        chooseSeatLink.click();
    }

    public void goToServiceClassesPage() {
        serviceClassesLink.click();
    }

    public void goToMakeOrderPage() {
        makeOrderLink.click();
    }

    public void goToOrderManagePage() {
        orderManageLink.click();
    }

    public void goToBaggageAllowancePage() {
        baggageAllowanceInfoLink.click();
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
