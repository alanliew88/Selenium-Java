import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox_Javascript {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //alert with ok button

        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        //alert with ok and cancel button

        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss(); // to click cancel button

        //alert with input box

        driver.findElement(By.xpath("//button[contains( text(), 'Click for JS Prompt')]")).click();
        Thread.sleep(2000);
        Alert alertwindow = driver.switchTo().alert();
        System.out.println("The message is displayed on alert"+" "+ alertwindow.getText());

        alertwindow.sendKeys("Welcome");
        Thread.sleep(2000);
        alertwindow.accept();



        driver.quit();




    }
}
