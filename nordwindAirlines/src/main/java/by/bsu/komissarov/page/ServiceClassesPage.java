package by.bsu.komissarov.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServiceClassesPage extends Page {

    @FindBy(xpath = "//div[@class=\"el-submenu__title\"][contains(text(), \"Информация\")]")
    private WebElement infoSubmenuButton;

    @FindBy(xpath = "//span[@class=\"el-menu-link__text\"][contains(text(), \"Классы обслуживания\")]")
    private WebElement serviceClassesLink;

    @FindBy(xpath = "//div[@class=\"page-heading\"][contains(text(), \"Классы обслуживания\")]")
    private WebElement serviceHeader;

    public boolean isServiceClassesPagePresent() {
        infoSubmenuButton.click();
        serviceClassesLink.click();
        return serviceHeader.isEnabled();
    }
}
