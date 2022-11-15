import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox_EcommerceSite {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://admin-demo.nopcommerce.com/login");

        WebElement emailinput = driver.findElement(By.id("Email"));
        emailinput.click();
        emailinput.clear();
        emailinput.sendKeys("admin@yourstore.com");

        WebElement passwordinput = driver.findElement(By.id("Password"));
        passwordinput.click();
        passwordinput.clear();
        passwordinput.sendKeys("admin");

        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();

        Thread.sleep(3000);
        //this webelement doenst working at all
        WebElement dropdownbutton = driver.findElement(By.xpath("//li[@class=\"nav-item has-treeview\"]//li//p[@xpath='4']"));
        dropdownbutton.click();
        boolean status = dropdownbutton.isEnabled();

        System.out.println("Step 1 completed");

        Thread.sleep(5000);

       driver.quit();







    }

}
