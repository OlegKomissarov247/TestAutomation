package by.bsu.komissarov.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServiceClassesPage extends Page {

    @FindBy(xpath = "//div[@class=\"page-heading\"][contains(text(), \"Классы обслуживания\")]")
    private WebElement serviceHeader;

    public boolean isServiceClassesPagePresent() {
        return serviceHeader.isEnabled();
    }
}
