import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver.Options;


import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Thread.sleep;

public class Dropdown_Bootstrap_dropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();



        //bootstrap dropdown doesnt have select tag, usually with a tag
        //to avoid pop up grey screen

        ChromeOptions options=new ChromeOptions();
        Map<String, Object> prefs=new HashMap<String,Object>();
        prefs.put("profile.default_content_setting_values.notifications", 1);
        //1-Allow, 2-Block, 0-default
        options.setExperimentalOption("prefs",prefs);

        //create webdriver as chromedriver but import options
        WebDriver driver = new ChromeDriver(options);

        driver.get("https:hdfcbank.com");

        //capture and click the dropdown button first

        WebElement producttypebutton = driver.findElement(By.xpath("//a[contains(text(),'Select Product Type')]"));
        producttypebutton.click();



        //driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();

        //using find element(s)

        //first Option dropdown

        List<WebElement> ProductListDropdown = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));

        System.out.println("Number of product :"+ ProductListDropdown.size());
        selectoption(ProductListDropdown, "Accounts");

        /*for (WebElement eachproductname :ProductListDropdown)
        {
            if(eachproductname.getText().equals("Accounts"))
            {
                eachproductname.click();
                System.out.println("Success click first option ");

            }
        }*/

        //Second option dropdown

        driver.findElement(By.xpath("//a[contains(text(),'Select Product')]")).click();

        List<WebElement> ProductDetails = driver.findElements(By.xpath("//div[@class='drp2']//ul[@class='dropdown2 dropdown-menu']//li"));
        selectoption(ProductDetails,"Savings Accounts");
        /*for (WebElement eachProductDetails:ProductDetails)
        {
            if (eachProductDetails.getText().equals("Savings Accounts"))
            {
                eachProductDetails.click();
                System.out.println("Success click Second option ");
            }

        }*/
    }
    public static void selectoption (List<WebElement> ele, String value) {



        for (WebElement everyoption:ele){
            if (everyoption.getText().equals(value)){
                everyoption.click();
            }
        }

    }



}
