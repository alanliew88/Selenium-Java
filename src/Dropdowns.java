import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdowns {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/register");

        driver.findElement(By.id("input-country")).isDisplayed();
        // Select method to handle dropdown
        Select dropcountry = new Select(driver.findElement(By.id("input-country")));
        dropcountry.selectByIndex(2);
        Thread.sleep(5000);
        dropcountry.selectByValue("129");
        Thread.sleep(5000);
        dropcountry.selectByVisibleText("India");
        Thread.sleep(2000);






        driver.quit();
        System.out.println("Success run all");

    }
}
