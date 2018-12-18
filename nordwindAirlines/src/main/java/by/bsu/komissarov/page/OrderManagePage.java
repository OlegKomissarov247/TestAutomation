package by.bsu.komissarov.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderManagePage extends Page {

    @FindBy(xpath = "//div[@class=\"el-submenu__title\"][contains(text(), \"Услуги\")]")
    private WebElement serviceSubmenuButton;

    @FindBy(xpath = "//span[@class=\"el-menu-link__text\"][contains(text(), \"Управление заказом\")]")
    private WebElement orderManageLink;

    @FindBy(xpath = "//div[@class=\"geo-warning\"]")
    private WebElement geoWarningModal;

    public boolean isGeoWarningModalPresent() {
        serviceSubmenuButton.click();
        orderManageLink.click();
        return geoWarningModal.isEnabled();
    }
}
