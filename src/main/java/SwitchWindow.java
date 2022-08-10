import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SwitchWindow {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        /*String windowid = driver.getWindowHandle();

        System.out.println(windowid);*/

        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        /*String secondwindowid = driver.getWindowHandle();


        System.out.println(secondwindowid);*/

        Set<String> IDlist = driver.getWindowHandles();
        List<String> allid = new ArrayList(IDlist);

        String firstwindow = allid.get(0);
        String secondwindow = allid.get(1);

        System.out.println(firstwindow);
        System.out.println(secondwindow);

        String title1 = driver.switchTo().window(firstwindow).getTitle();
        System.out.println(title1);

        String title2 = driver.switchTo().window(secondwindow).getTitle();
        System.out.println(title2);

        for (String singleid:allid){

            if (singleid.equals("OrangeHRM")){
                driver.close();
            }


        }

        driver.quit();





    }
}
