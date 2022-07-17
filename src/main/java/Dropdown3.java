import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;



public class Dropdown3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://agoda.com");


        driver.findElement(By.xpath("//*[@id=/'SearchBoxContainer/']/div[1]/div/div[2]/div/div/div[1]/div/div/input")).click();

        Thread.sleep(2000);




        driver.quit();


        System.out.println("Success run code");


    }
}
