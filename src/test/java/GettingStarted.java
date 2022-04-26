
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class GettingStarted {
    @Test
    public void testGoogleSearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().setSize(new Dimension(1920, 1040));
        driver.findElement(By.id("userName")).click();
        driver.findElement(By.id("userName")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");

        driver.findElement(By.id("userName")).sendKeys("osman");

        assertEquals(driver.findElement(By.cssSelector(".border > #currentAddress")).getText(),  "Current Address :hello I am here");

       driver.quit();
    }

}


