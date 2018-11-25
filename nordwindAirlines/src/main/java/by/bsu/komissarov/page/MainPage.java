package by.bsu.komissarov.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Page {

    private static final int MAX_ADULTS_AMOUNT = 9;

    @FindBy(id = "dp1541155242390")
    private WebElement datePicker;

    @FindBy(xpath = "//button[@class = \"ui-datepicker-unselectable\"]")
    private WebElement dateDisabled;

    @FindBy(xpath = "//input[@data-type = \"adults\"]")
    private WebElement adultsInput;

    @FindBy(xpath = "//button[@disabled=\"disabled\"]/svg[@class = \"search-form__icon-arrow_right\"]")
    private WebElement addAdultButtonDisabled;

    public boolean IsDateDisabledPresent() {
        datePicker.click();
        return dateDisabled.isEnabled();
    }

    public boolean isAddAdultButtonDisabledPresent() {
        adultsInput.clear();
        adultsInput.sendKeys(String.valueOf(MAX_ADULTS_AMOUNT));
        datePicker.click();
        return addAdultButtonDisabled.isEnabled();
    }
}
