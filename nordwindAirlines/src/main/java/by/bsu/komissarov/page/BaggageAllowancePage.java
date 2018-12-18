package by.bsu.komissarov.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaggageAllowancePage extends Page {

    @FindBy(xpath = "//div[@class=\"cost__dialog-title\"][contains(text(), \"Стоимость провоза багажа\")]")
    private WebElement baggageAllowanceModal;

    @FindBy(xpath = "//a[@class=\"child-pickers-switch\"][contains(text(), \"Я путешествую с детьми\")]")
    private WebElement addChildrenButton;

    public boolean isBaggageAllowanceModalPresent() {
        addChildrenButton.click();
        return baggageAllowanceModal.isEnabled();
    }
}
