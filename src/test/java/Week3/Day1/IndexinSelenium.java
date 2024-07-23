package Week3.Day1;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class IndexinSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // WebElement element = driver.findElement(By.id("countrySelect"));

        // Select programselect = new Select(element);
        // programselect.selectByIndex(2);

        WebElement element = driver.findElement(By.id("languageSelect"));

        Select languageElement = new Select(element);
        languageElement.selectByIndex(4);



    }
}
