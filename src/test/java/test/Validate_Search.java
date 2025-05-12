package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Validate_Search {

//    final static Logger logger = Logger.getLogger(Validate_Dashboard.class);
    private WebDriver driver;
    private Object utils;

    @BeforeTest
    public void setUp()
    {
driver = new ChromeDriver();
driver.manage().window().maximize();
    }

    @Test
    public void validatesearch()
    {
driver.get("https://www.redbus.in/");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.redbus.in/");

//WebElement element3 = driver.findElement(By.xpath("//h1[text()='India's No. 1 Online Bus Ticket Booking Site']"));
//String str1=element3.getText();
//        Assert.assertEquals(str1,"India's No. 1 Online Bus Ticket Booking Site");
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//driver.findElement(By.xpath,)
//        Duration duration = Duration.ofSeconds(10);
//        WebDriverWait wait = new WebDriverWait(utils.driver, duration);

 //      WebDriverWait wait = new WebDriverWait(driver,10);
//        int timeoutInSeconds = 120;
//        Duration duration = Duration.ofSeconds(timeoutInSeconds);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement element1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='sc-ifAKCX kPhbmx']")));
//        //WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='From']")));
//        element1.sendKeys("Chennai");
//        WebElement element2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='CMBT, Chennai']")));
//        element2.click();

//        logger.info(Icon);

//driver.findElement(By.xpath("//div[@class='label___7cec60']")).sendKeys("Chennai");
//driver.findElement(By.xpath("//li[@class='sc-iwsKbI jTMXri']")).click();//li[@class='sc-iwsKbI jTMXri']
//driver.findElement(By.xpath("//input[@class='sc-bxivhb dsDRlf']")).sendKeys("Bengaluru");
//driver.findElement(By.xpath("//text[text()='Kempegowda International Airport Bengaluru']")).click();
    }

//    @AfterTest
//    public void tearDown()
//    {
//       if(driver != null)
//      {
//          driver.quit();
//      }
//    }


}
