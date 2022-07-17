import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestCaseChrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/alanliew/Downloads/Driver and Jar file/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https:google.com");
        System.out.println(driver.getTitle());

        driver.close();
    }
}


