import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Locator_xpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");


        //using self create basic xpath //tagname[@attribute, 'value']
        driver.findElement(By.xpath("//input[@name='search_query']"));


        //using self create xpath //tagname[contains(@attribute, 'value')]
        driver.findElement(By.xpath("//input[contains(@name, '_query')]")).sendKeys("Apple");
        Thread.sleep(2000);

        //using self create xpath //tagname[starts-with(@attribute, 'value')]
        WebElement searchbox = driver.findElement(By.xpath("//input[starts-with(@name, 'search')]"));
        searchbox.clear();
        searchbox.sendKeys("Orange");
        Thread.sleep(2000);

        driver.close();


    }
}
