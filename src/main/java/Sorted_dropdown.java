import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorted_dropdown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.twoplugs.com/newsearchserviceneed");

        //driver.findElement(By.xpath("//a[contains(text(),'Live Posting')]")).click();

        Select dropdown = new Select(driver.findElement(By.name("category_id")));
        List<WebElement> options = dropdown.getOptions();

        ArrayList originallist = new ArrayList();
        ArrayList templist = new ArrayList();

        //before sorted
        for (WebElement singleoption:options){
            originallist.add(singleoption.getText());
            templist.add(singleoption.getText());
        }

        Collections.sort(templist);

        if (originallist.equals(templist)){
            System.out.println("Dropdown sorted");
        }else{
            System.out.println("Dropdown unosorted");
        }


    }
}
