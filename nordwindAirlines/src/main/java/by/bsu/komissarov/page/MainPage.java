package by.bsu.komissarov.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Page {

    private static final int MAX_ADULTS_AMOUNT = 9;

    @FindBy(xpath = "//span[contains(text(), \"Только туда\")]")
    private WebElement oneWayButton;

    @FindBy(xpath = "//div[@class = \"search-form__field search-form__field_date-arrival js-date-to-container field_hidden\"]//input[contains(@placeholder, \"Вылет обратно\")]")
    private WebElement datePickerBackInputHidden;

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

    @FindBy(xpath = "//div[@class=\"el-submenu__title\"][contains(text(), \"Услуги\")]")
    private WebElement serviceSubmenuButton;

    @FindBy(xpath = "//span[@class=\"el-menu-link__text\"][contains(text(), \"Управление заказом\")]")
    private WebElement orderManageLink;

    @FindBy(xpath = "//div[@class=\"el-menu-link__text\"][contains(text(), \"Управление заказом\")]")
    private WebElement geoWarningModal;

    @FindBy(xpath = "//span[@class=\"el-menu-link__text\"][contains(text(), \"Выбор места в самолёте\")]")
    private WebElement baggageAllowanceInfoLink;

    @FindBy(xpath = "//div[@class=\"cost__dialog-title\"][contains(text(), \"Стоимость провоза багажа\")]")
    private WebElement baggageAllowanceModal;

    @FindBy(xpath = "//i[@class=\"icon_minus\"]")
    private WebElement minusAdultsOrderFormIcon;

    @FindBy(xpath = "//input[@class=\"valueInp valueInp_js ng-pristine ng-valid ng-not-empty ng-touched\"]")
    private WebElement adultsOrderFormInput;

    @FindBy(xpath = "//span[@class=\"el-menu-link__text\"][contains(text(), \"Купить билет\")]")
    private WebElement makeOrderLink;

    @FindBy(xpath = "//a[@class=\"child-pickers-switch\"][contains(text(), \"Я путешествую с детьми\")]")
    private WebElement addChildrenButton;

    @FindBy(xpath = "//label[contains(text(), \"Дети (2-12)\")]")
    private WebElement childrenCountLabel;

    @FindBy(xpath = "//span[@class=\"el-menu-link__text\"][contains(text(), \"Выбор места в самолете\")]")
    private WebElement chooseSeatLink;

    @FindBy(xpath = "//span[@class=\"seat-selection__tab\"][contains(text(), \"Бизнес класс\")]")
    private WebElement businessClassSeatsTab;

    @FindBy(xpath = "//div[@class=\"seat-selection__scheme_business-class\"]")
    private WebElement businessClassSeatsBlock;

    public boolean IsPrevMonthDisabledPresent() {
        datePickerInput.click();
        return prevMonth.isEnabled();
    }

    public boolean isAddAdultButtonDisabledPresent() {
        adultsInput.clear();
        adultsInput.sendKeys(String.valueOf(MAX_ADULTS_AMOUNT));
        subHeader.click();
        return addAdultButtonDisabled.isEnabled();
    }

    public boolean isEnglishPlaceholderPresent() {
        langSwitcher.click();
        englishLanguageButton.click();
        return englishDatepickerPlaceholder.isEnabled();
    }

    public boolean isBackDatePickerInputPresent() {
        new Actions(driver).click(oneWayButton).perform();
        return datePickerBackInputHidden.isEnabled();
    }

    public boolean isGeoWarningModalPresent() {
        serviceSubmenuButton.click();
        orderManageLink.click();
        return geoWarningModal.isEnabled();
    }

    public boolean isBaggageAllowanceModalPresent() {
        serviceSubmenuButton.click();
        baggageAllowanceInfoLink.click();
        addChildrenButton.click();
        return baggageAllowanceModal.isEnabled();
    }

    public boolean isChildrenCountLabelPresent() {
        serviceSubmenuButton.click();
        makeOrderLink.click();
        return childrenCountLabel.isEnabled();
    }

    public boolean isBusinessClassSeatsBlockPresent() {
        serviceSubmenuButton.click();
        chooseSeatLink.click();
        businessClassSeatsTab.click();
        return businessClassSeatsBlock.isEnabled();
    }
}
