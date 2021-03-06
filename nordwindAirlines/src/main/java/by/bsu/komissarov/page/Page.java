package by.bsu.komissarov.page;

import by.bsu.komissarov.driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public abstract class Page {
    WebDriver driver;

    public Page() {
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}
