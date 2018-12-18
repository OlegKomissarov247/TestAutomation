package by.bsu.komissarov.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakeOrderPage extends Page {

    @FindBy(xpath = "//label[contains(text(), \"Дети (2-12)\")]")
    private WebElement childrenCountLabel;

    public boolean isChildrenCountLabelPresent() {
        return childrenCountLabel.isEnabled();
    }
}
