import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;



public class Dropdown2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://airasia.com");

        WebElement source = driver.findElement(By.id("flight-place-picker"));
        source.isDisplayed();
        source.click();
        //source.sendKeys("Kuala Lumpur");
        //source.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=/'tippy-3/']/div/div/span/div/ul/li[2]")).isDisplayed();



        driver.quit();
        System.out.println("Code run all successfully");
    }
}
