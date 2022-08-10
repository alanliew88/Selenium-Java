import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.List;

public class BrokenLinksCheck {

    public static void main(String[] args) throws MalformedURLException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://deadlinkcity.com");

        driver.manage().window().maximize();

        List<WebElement> alllinks = driver.findElements(By.tagName("a"));

        int brokenlinks = 0;

        for (WebElement link:alllinks){

            System.out.println(link.getText());
            String url = link.getAttribute("href");

            if (url==null || url.isEmpty()){
                System.out.println("Link is empty");
                continue;

            }

            URL alink = new URL(url);
            try{
                HttpURLConnection httpcon = (HttpURLConnection) alink.openConnection();
                httpcon.connect();
                if(httpcon.getResponseCode()>=400){
                    System.out.println(httpcon.getResponseCode() +" " +url+ " "+ "Broken link");
                    brokenlinks++;
                }
                else{
                    System.out.println(httpcon.getResponseCode()+" " +url+" "+ "Valid Link");
                }

            } catch (Exception e) {


            }




        }
        System.out.println("Number of broken links: " + brokenlinks);

    }
}
