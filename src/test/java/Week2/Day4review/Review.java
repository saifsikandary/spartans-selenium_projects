package Week2.Day4review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review {
    public static void main(String[] args) {
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://retail.tekschool-students.com");
        driver1.findElement(By.cssSelector(".top-nav__btn")).click();
        driver1.findElement(By.cssSelector(".login__input")).sendKeys("saifullahsikandary62@gmail.com");
        driver1.findElement(By.cssSelector("#password")).sendKeys("Afghan@123");
        driver1.findElement(By.cssSelector("##loginBtn")).click();




    }
    }
