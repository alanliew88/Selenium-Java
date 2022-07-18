import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownSelect {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.opencart.com/index.php?route=account/register");

        WebElement dropdown = driver.findElement(By.id("input-country"));
        //create new select class
        Select dropdownselect = new Select(dropdown);

        //selectbyvalue (using value )
        dropdownselect.selectByValue("9");
        //selectbyindex ( count from 0 ,1 ,2 ,3 ,4 etc )
        dropdownselect.selectByIndex(16);
        //selectbyvisibletext
        dropdownselect.selectByVisibleText("Belgium");

        //to get all options in the dropdown
        // list of web element named alloptions
        List<WebElement> alloptions = dropdownselect.getOptions();

        for (WebElement singleoption:alloptions)
        {
            if (singleoption.getText().equalsIgnoreCase("Argentina"))
            {
                singleoption.click();
                break;
            }

        }



    }
}
