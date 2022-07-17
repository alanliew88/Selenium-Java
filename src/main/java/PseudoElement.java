import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PseudoElement {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/alanliew/Downloads/Driver and Jar file/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://agoda.com");

        Thread.sleep(5000);

        Actions action = new Actions(driver);
        WebElement closebutton = driver.findElement(By.tagName("svg"));
        action.moveToElement(closebutton).click().build().perform();


        driver.quit();
        System.out.println("Success");
    }
}
