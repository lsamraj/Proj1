package test;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {
    private WebDriver driver;

    @BeforeTest
    public void setUp()
    {
        driver = new ChromeDriver();
    }

    @Test
    public void testGooglePageTitle()
    {
        driver.get("https://www.google.co.in/");

        boolean isGooglePageOpen = driver.getTitle().contains("Google");

        Assert.assertTrue(isGooglePageOpen,"Google was opened successfully");
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
