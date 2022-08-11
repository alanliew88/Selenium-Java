import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Alert_popup_notifcation {
    public static void main(String[] args) {

        //disable notification pop up from chrome

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notification");

        //disabble notification pop up from firefox

        FirefoxOptions options1 = new FirefoxOptions();
        options.addArguments("--disable-notification");




        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://redbus.in/");

    }
}
