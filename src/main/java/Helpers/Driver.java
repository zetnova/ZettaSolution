package Helpers;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static WebDriver driver = null;

    public static WebDriver getDriver() {
        if (driver == null) {
            setup();
        }
        return driver;
    }

    @Before("@FrontendTest")
    public static void setup() {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        WebDriverManager.chromedriver().setup();
        driver = new org.openqa.selenium.chrome.ChromeDriver(options);
        driver.manage().window().maximize();
    }



   @After("@FrontendTest")
  public static void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }



}

