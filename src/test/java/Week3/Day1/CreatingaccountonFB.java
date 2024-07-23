package Week3.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreatingaccountonFB {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname"))).sendKeys("Ahmad");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("lastname"))).sendKeys("Fahimi");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("reg_email__"))).sendKeys("Ahmad.fahimi@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("reg_passwd__"))).sendKeys("Afghan@123");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("birthday_month"))).click();



    }
}
