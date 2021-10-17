package webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends AbstractDriver {

    @Override
    public WebDriver createDriver() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        return driver;
    }
}
