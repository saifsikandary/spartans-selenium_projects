package Week3.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class SelectElement2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        driver.findElement(By.xpath("//p[text()='Accessories']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='Wireless Keyboard and Mouse Combo Backlit']")));
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

        sleep(10);
        driver.findElement(By.xpath("//p[text()='Wireless Keyboard and Mouse Combo Backlit']")).click();

        WebElement element2 = driver.findElement(By.cssSelector(".product__select"));
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));

        Select quantityelement = new Select(element2);
        quantityelement.selectByValue("5");

    }
}
