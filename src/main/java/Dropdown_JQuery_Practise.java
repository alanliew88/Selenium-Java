import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dropdown_JQuery_Practise {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        driver.findElement(By.id("justAnInputBox")).click();
        //List<WebElement> alloptions = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

        //SelectOption(driver,"choice 2 1", "choice 6");
        SelectOption(driver,"all");


    }
    public static void SelectOption (WebDriver driver, String... value){

        List<WebElement> alloptions = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

        if (!value[0].equalsIgnoreCase("all")){

            for (WebElement singleoption:alloptions){
                //because value could be a list of value so, need to do for : all first
                //String text = singleoption.getText();


                for (String val : value){
                    if (singleoption.getText().equals(val)){
                        singleoption.click();
                    }
                }
            }


        }
        else{
            for(WebElement chooseall:alloptions){
                chooseall.click();

            }
        }
    }
}
