package webdriver;

import org.openqa.selenium.WebDriver;

public abstract class AbstractDriver {

    static WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) {
            driver = createDriver();
        }
        return driver;
    }
    public abstract WebDriver createDriver();

    public void quitDriver() {
        driver.quit();
    }
}
