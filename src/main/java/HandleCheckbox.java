import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckbox {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://itera-qa.azurewebsites.net/home/automation");

        //select single checkbox
        driver.findElement(By.id("monday")).click();

        //select all checkbox
        List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@class='form-check-input' and contains (@id,'day')]"));
        //using for each loop
        /*for (WebElement singlecheckbox:allcheckbox){
            singlecheckbox.click();
        }

        //using for loop

        for (int i=0; i<checkbox.size(); i++){
        checkbox.get(i).click();
        }


        //select multiple checkboxes
        for (WebElement singlecheckbox:allcheckbox){
            String checkboxname = singlecheckbox.getAttribute("id");

            if (checkboxname.equals("monday")||checkboxname.equals("sunday")){
                singlecheckbox.click();
            }

        }*/

        //select last two checkboxes

        int totalnumberofcheckboxes = allcheckbox.size();

        /*for(int i=totalnumberofcheckboxes-2; i<totalnumberofcheckboxes;i++){
            allcheckbox.get(i).click();
        }*/

        //select first two checkboxes

        for(int i=0;i<totalnumberofcheckboxes;i++){
            if(i<2){
                allcheckbox.get(i).click();
            }
        }








    }
}
