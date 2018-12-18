package by.bsu.komissarov.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakeOrderPage extends Page {

    @FindBy(xpath = "//span[@class=\"el-menu-link__text\"][contains(text(), \"Купить билет\")]")
    private WebElement makeOrderLink;

    @FindBy(xpath = "//label[contains(text(), \"Дети (2-12)\")]")
    private WebElement childrenCountLabel;

    @FindBy(xpath = "//div[@class=\"el-submenu__title\"][contains(text(), \"Услуги\")]")
    private WebElement serviceSubmenuButton;

    public boolean isChildrenCountLabelPresent() {
        serviceSubmenuButton.click();
        makeOrderLink.click();
        return childrenCountLabel.isEnabled();
    }
}
