import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://admin-demo.nopcommerce.com/login");

        org.openqa.selenium.WebElement username = driver.findElement(By.id("Email"));
        org.openqa.selenium.WebElement password = driver.findElement(By.id("Password"));
        org.openqa.selenium.WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));

        //get attribute method
        System.out.println("The default value is :" + username.getAttribute("value"));
        //get text method
        System.out.println("The button get text is :" + button.getText());

        button.click();
    }
}
