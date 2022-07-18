import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingMultipleDropdownPractise {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        //Select drpdwn = new Select(day);
        //drpdwn.selectByVisibleText("16");
        SelecOptionFromDropdown(day,"16");
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        SelecOptionFromDropdown(month,"April");
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
        SelecOptionFromDropdown(year,"1997");




    }

    public static void SelecOptionFromDropdown (WebElement ele, String value)
    {
        //Create select class to select the webelement , ele = day / month/ year
        Select drp = new Select(ele);
        //create a list of web element that store all the options
        List<WebElement> alloptions=drp.getOptions();
        //for every single option in the all options
        for (WebElement singleoption:alloptions)
        {
           if (singleoption.getText().equals(value))
           {
               singleoption.click();
               break;
           }
        }
    }
}
