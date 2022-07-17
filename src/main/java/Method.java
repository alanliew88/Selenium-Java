import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Method {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/alanliew/Downloads/Driver and Jar file/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register");
        WebElement searchbox = driver.findElement(By.id("small-searchterms"));
        //is displayed
        System.out.println("Display status :" + searchbox.isDisplayed());
        //is enabled
        System.out.println("Enabled status :"+ searchbox.isEnabled());
        //is selected
        WebElement male = driver.findElement(By.id("gender-male"));
        WebElement female = driver.findElement(By.id("gender-female"));
        System.out.println("Is male selected :"+ male.isSelected());
        System.out.println("Is Female selected :"+ female.isSelected());

        driver.quit();

    }
}
