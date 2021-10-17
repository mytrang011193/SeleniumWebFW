package execution;

import org.openqa.selenium.WebDriver;
import webdriver.ChromeDriverManager;
import webdriver.DriverFactory;
import webdriver.WebDriverType;

public class BaseTest {
    protected WebDriver getDriver() {
        return DriverFactory.getDriverManager(WebDriverType.CHROME).getDriver();
    }
}
