import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PseudoElement2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/alanliew/Downloads/Driver and Jar file/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://agoda.com");

        Thread.sleep(5000);

        //Actions action = new Actions(driver);
        //WebElement closebutton = driver.findElement(By.tagName("svg"));
        //action.moveToElement(closebutton).click().build().perform();


        //WebElement closebutton = driver.findElement(By.className("ab-close-button"));
        //closebutton.isDisplayed();
        //closebutton.click();

        driver.quit();
        System.out.println("Success");
    }
}
