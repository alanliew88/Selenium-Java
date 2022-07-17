import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class GetAttributeGetText {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://admin-demo.nopcommerce.com/login");

        WebElement username = driver.findElement(By.id("Email"));
        WebElement password = driver.findElement(By.id("Password"));
        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));

        //get attribute method
        System.out.println("The default value is :" + username.getAttribute("value"));
        //get text method
        System.out.println("The button get text is :" + button.getText());


        username.clear();
        username.sendKeys("abc@gmail.com");
        password.sendKeys("1234");






    }
}
