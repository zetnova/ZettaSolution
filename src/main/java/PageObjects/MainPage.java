package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Helpers.Driver.getDriver;

public class MainPage {
    public static WebElement search() {
        return getDriver().findElement(By.id("twotabsearchtextbox"));
    }

}