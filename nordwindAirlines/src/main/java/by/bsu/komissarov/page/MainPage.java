package by.bsu.komissarov.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Page {

    @FindBy(id = "dp1541155242390")
    private WebElement datePicker;

    @FindBy(xpath = "//button[@class = \"ui-datepicker-unselectable\"]")
    private WebElement dateDisabled;

    public boolean IsDateDisabledPresent(){
        datePicker.click();
       return dateDisabled.isEnabled();
    }
}
