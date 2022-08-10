import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleLinks {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.in/");

        driver.manage().window().maximize();

        //driver.findElement(By.linkText("Customer Service"));

        //driver.findElement(By.partialLinkText("Service"));

        List<WebElement> allpagelinks = driver.findElements(By.tagName("a"));

        System.out.println(allpagelinks.size());
        for (WebElement singlepage:allpagelinks){
            System.out.println(singlepage.getText());
            System.out.println(singlepage.getAttribute("href"));
        }




    }
}
