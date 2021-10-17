package webdriver;

public class DriverFactory {

    private DriverFactory() {};
    private static AbstractDriver driverManager;

    public static AbstractDriver getDriverManager(WebDriverType webDriverType) {

        switch (webDriverType) {
            case SAFARI:
                //new Safari driver
                System.out.println("New Safari driver");
            default:
                driverManager = new ChromeDriverManager();
        }
        return driverManager;
    }
}
