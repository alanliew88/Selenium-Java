import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


// testing using different locators  ID , name ,linktext,  Xpath,
public class Locator {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/alanliew/Downloads/Driver and Jar file/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https:login.salesforce.com");
        driver.manage().window().maximize();
        //by id
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
        // by name
        driver.findElement(By.name("pw")).click();
        driver.findElement(By.name("pw")).sendKeys("12345678");
        //by xpath
        driver.findElement(By.linkText("Forgot Your Password?")).isDisplayed();
        driver.findElement(By.xpath("//*[@id='Login']")).isEnabled();
        driver.findElement(By.xpath("//*[@id=\'rememberUn\']")).isDisplayed();
        //by csspath
        driver.findElement(By.cssSelector("#username")).clear();
        driver.findElement(By.cssSelector("#password")).clear();
        driver.findElement(By.cssSelector("#password")).sendKeys("456789");

// way to validate the xpath and css selector
        //1. $x("//*[@id='forgot_password_link']")         - this is for xpath
        //2. $("#forgot_password_link")                     - this is for css selector

        driver.quit();
    }
}
