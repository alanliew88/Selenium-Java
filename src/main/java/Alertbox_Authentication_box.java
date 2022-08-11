import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox_Authentication_box {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //driver.get("https://the-internet.herokuapp.com/basic_auth");

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //syntax
        // https://user:password@the-internet.herokuapp.com/basic_auth


    }
}
