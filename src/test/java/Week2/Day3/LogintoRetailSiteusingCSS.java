package Week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogintoRetailSiteusingCSS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        WebDriverWait waittime = new WebDriverWait(driver, Duration.ofSeconds(15));
        waittime.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".top-nav__btn"))).click();
        waittime.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".login__input"))).sendKeys("saifullahsikandary62@gmail.com");
        waittime.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#password"))).sendKeys("Afghan@123");
        waittime.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#loginBtn"))).click();
        waittime.until(ExpectedConditions.elementToBeClickable(By.id("accountLink")));
        waittime.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='phoneNumber']"))).sendKeys("555-222-1234");
        waittime.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#personalUpdateBtn"))).click();
        WebElement updateElement = waittime.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".Toastify")));
        System.out.println(updateElement.getText());

        driver.quit();


    }
}
