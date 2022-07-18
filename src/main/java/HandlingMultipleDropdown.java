import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingMultipleDropdown {
    static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register");

        //Normal Approach - 1
        Select daydrp = new Select(driver.findElement(By.name("DateOfBirthDay")));
        daydrp.selectByVisibleText("16");
        Select monthdrp = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        monthdrp.selectByVisibleText("April");
        Select yeardrp = new Select(driver.findElement(By.name("DateOfBirthYear")));
        yeardrp.selectByVisibleText("1997");

        //Webelement approach
        WebElement dayele = driver.findElement(By.name("DateOfBirthDay"));
        selectOptionFromDropdown(dayele,"17");
        WebElement monthele= driver.findElement(By.name("DateOfBirthMonth"));
        selectOptionFromDropdown(monthele,"May");
        WebElement yearele = driver.findElement(By.name("DateOfBirthYear"));
        selectOptionFromDropdown(yearele,"1998");






    }

    public static void selectOptionFromDropdown(WebElement ele, String value)
    {
        Select drp = new Select(ele);
        List<WebElement> alloptions = drp.getOptions();

        for (WebElement singleoption:alloptions)
        {
            if (singleoption.getText().equalsIgnoreCase(value))
            {
                singleoption.click();
                break;
            }

        }
    }
}
