package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //ELEMENT
    private By USERNAME_TEXTBOX_BY = By.cssSelector("formcontrolname='username'");

    //METHOD
    public void enterUserName(String username) {
        driver.findElement(USERNAME_TEXTBOX_BY).sendKeys(username);
    }
}
