package by.bsu.komissarov.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseSeatPage extends Page {

    @FindBy(xpath = "//span[@class=\"seat-selection__tab\"][contains(text(), \"Бизнес класс\")]")
    private WebElement businessClassSeatsTab;

    @FindBy(xpath = "//div[@class=\"seat-selection__scheme_business-class\"]")
    private WebElement businessClassSeatsBlock;

    public boolean isBusinessClassSeatsBlockPresent() {
        businessClassSeatsTab.click();
        return businessClassSeatsBlock.isEnabled();
    }
}
