package by.bsu.komissarov.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseSeatPage extends Page {

    @FindBy(xpath = "//div[@class=\"el-submenu__title\"][contains(text(), \"Услуги\")]")
    private WebElement serviceSubmenuButton;

    @FindBy(xpath = "//span[@class=\"el-menu-link__text\"][contains(text(), \"Выбор места в самолете\")]")
    private WebElement chooseSeatLink;

    @FindBy(xpath = "//span[@class=\"seat-selection__tab\"][contains(text(), \"Бизнес класс\")]")
    private WebElement businessClassSeatsTab;

    @FindBy(xpath = "//div[@class=\"seat-selection__scheme_business-class\"]")
    private WebElement businessClassSeatsBlock;

    public boolean isBusinessClassSeatsBlockPresent() {
        serviceSubmenuButton.click();
        chooseSeatLink.click();
        businessClassSeatsTab.click();
        return businessClassSeatsBlock.isEnabled();
    }
}
