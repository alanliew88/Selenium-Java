import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dropdown_Bootstrap_Practise {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options=new ChromeOptions();
        Map<String, Object> prefs=new HashMap<String,Object>();
        prefs.put("profile.default_content_setting_values.notifications", 1);
        //1-Allow, 2-Block, 0-default
        options.setExperimentalOption("prefs",prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.hdfcbank.com/");

        driver.findElement(By.xpath("//div[@class='drp1']")).click();

        List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='dropdown open']//ul//li"));

        System.out.println("Total number of product:"+alloptions.size());


        selectOption (alloptions,"Cards");

        driver.findElement(By.xpath("//div[@class='drp2']")).click();

        List <WebElement> secondalloption = driver.findElements(By.xpath("//div[@class='drp2']//ul//li"));

        System.out.println("Total type of product details : "+secondalloption.size());

        selectOption(secondalloption,"Forex Cards");

    }
    public static void selectOption(List<WebElement> ele, String value){


        for (WebElement singleoption:ele){

            if(singleoption.getText().equals(value)){
                singleoption.click();
            }


        }
    }
}
