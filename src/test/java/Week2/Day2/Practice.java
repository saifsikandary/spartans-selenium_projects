package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://retail.tekschool-students.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//p[text()='Video Games']")).click();
        driver.findElement(By.xpath("//p[text()='PlayStation 5 Console']")).click();
        driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();


       // driver.get("https://retail.tekschool-students.com");
        //By expatlocator = By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div[1]/div[2]/h1");
        /*
        driver.get("https://facebook.com");
        By xpathlocator = By.xpath("/html/body/div[1]/div/div/div/div/div/div/h2");
*/

    }
}
