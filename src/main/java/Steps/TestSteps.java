package Steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import static Helpers.Driver.getDriver;
import static Helpers.Helper.*;
import static PageObjects.MainPage.search;
import static org.testng.AssertJUnit.assertEquals;

public class TestSteps {

    WebDriver driver;


    @Given("Enter amazon.com and check the homepage")
    public void onAmazonSite() throws InterruptedException {
        driver = getDriver();
        driver.get("https://www.amazon.com/");
        checkPageTittle("Amazon.com");
        checkPageUrl("https://www.amazon.com/");
        pause(60000);
        search().isDisplayed();

        }
    }


