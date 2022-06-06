import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SampleAmazonlaunch {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement fullname = driver.findElement(By.id("//input[@id='userName']"));
        fullname.sendKeys("Arun Prasath");

        //driver.findElement(By.xpath("//a/span[contains(text(),'Apple iPhone 13 Pro Max (256GB) - Sierra Blue')]"));
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

    }
}
