package testcase;

import execution.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.LoginPage;

public class LoginTest extends BaseTest {
    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        loginPage = new LoginPage(getDriver());
        getDriver().get("https://systemmanagement-stage.karrostech.io/login");
    }

    @AfterClass
    public void tearDown() {
    }

    @Test
    public void login() {
        loginPage.enterUserName("testing@test.com");

    }
}
