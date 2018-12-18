package by.bsu.komissarov.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderManagePage extends Page {

    @FindBy(xpath = "//div[@class=\"geo-warning\"]")
    private WebElement geoWarningModal;

    public boolean isGeoWarningModalPresent() {
        return geoWarningModal.isEnabled();
    }
}
