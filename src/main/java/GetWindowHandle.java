import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GetWindowHandle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        //get window handle

        /*String windowid= driver.getWindowHandle();
        System.out.println("Page title :"+ driver.getTitle());
        System.out.println("Window ID :"+ windowid);*/

        //get window handles - using iterator to move to next window
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        Set<String> allwindowid = driver.getWindowHandles();

        // using iterator method

        /*Iterator<String> it = allwindowid.iterator();

        String parentwindowid = it.next();
        String childwindowid = it.next();

        System.out.println("Parent window id :"+ parentwindowid );
        System.out.println("child Window Id : "+ childwindowid );*/

        // using list
        // using get method

        List<String> allwindowidlist = new ArrayList(allwindowid);

        String parentid = allwindowidlist.get(0);
        String childid = allwindowidlist.get(1);

        System.out.println("Parent window id :"+ parentid );
        System.out.println("child Window Id : "+ childid );

        //use window ID to switch window tab

        /*driver.switchTo().window(parentid);
        System.out.println("Parent window title"+ driver.getTitle());


        driver.switchTo().window(childid);
        System.out.println("Child window title"+ driver.getTitle());*/

        //using for loop to retrieve page title

        for (String singlewindow:allwindowidlist){

           String title = driver.switchTo().window(singlewindow).getTitle();
           System.out.println(title);

        }



    }
}
