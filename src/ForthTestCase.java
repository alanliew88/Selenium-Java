import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForthTestCase {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/alanliew/Downloads/Driver and Jar file/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("htttps://google.com");
        driver.navigate().refresh();
        driver.navigate().forward();
        //driver.navigate().back();
        driver.close();
    }
}
