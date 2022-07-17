import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondTestCaseFireFox {
    public static void main(String[] args) {


        System.setProperty("webdriver.firefox.driver", "/Users/alanliew/Downloads/Driver and Jar file/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https:google.com");
        System.out.println(driver.getTitle());

        driver.close();


    }
}
