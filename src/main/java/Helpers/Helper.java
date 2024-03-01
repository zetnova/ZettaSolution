package Helpers;

import org.openqa.selenium.WebDriver;

import static Helpers.Driver.getDriver;
import static org.testng.AssertJUnit.assertEquals;

public class Helper {

    static WebDriver driver = getDriver();
    static String title;
   static String url;

   public static void checkPageTittle(String expectedTitle){
        title = driver.getTitle();
        assertEquals(expectedTitle, title);
        System.out.println(title);
    }

    public static void checkPageUrl(String expectedUrl){
        url = driver.getCurrentUrl();
        assertEquals(expectedUrl,url);
        System.out.println(url);
    }

    public static void pause (final long timeInMillis) throws InterruptedException {
        Thread.sleep (timeInMillis);
    }





}
