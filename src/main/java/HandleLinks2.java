import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleLinks2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://deadlinkcity.com");

        driver.manage().window().maximize();

        driver.findElement(By.partialLinkText("Errorcode 400"));

        List<WebElement> semualinks = driver.findElements(By.tagName("a"));

        for (WebElement single:semualinks){
            System.out.println(single.getText());
            System.out.println(single.getAttribute("href"));
            String url = single.getAttribute("href");
            if (url==null || url.isEmpty()){
                System.out.println("url is empty");
                continue;
            }

        }

        driver.quit();



    }
}
