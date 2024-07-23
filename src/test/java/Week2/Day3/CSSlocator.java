package Week2.Day3;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSlocator {
    public static void main(String[] args) {
        WebDriver csslocator = new ChromeDriver();
        csslocator.manage().window().maximize();

        csslocator.get("https://dev.insurance.tekschool-students.com/");
       // csslocator.findElement(By.cssSelector(".chakra-text"));
        csslocator.findElement(By.cssSelector(".chakra-button")).click();

    }
}
