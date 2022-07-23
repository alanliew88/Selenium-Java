import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class Dropdown_JQuery {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.manage().window().maximize();

        driver.findElement(By.id("justAnInputBox")).click();
        //selectChoices(driver,"all");
        //selectChoices(driver,"choice1","choice 2 3","choice 6", "choice 6 1", "choice 6 2 1");
        //selectChoices(driver,"choice 5");

        //selectChoices(driver, 'choice1')   - select one choice
        //selectChoices(driver, 'choice1', 'choice2', 'choice3') - select multiple choice
        //selectChoices(driver, "all") - select all
    }

    public static void selectChoices (WebDriver driver,String... value){

        List<WebElement> Choicelist = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

        if(!value[0].equalsIgnoreCase("all"))
        {
                for (WebElement singlechoice:Choicelist){
                    String text = singlechoice.getText();

                    for (String val : value){
                        if (text.equals(val)){
                            singlechoice.click();
                            break;
                        }
                    }

                }
        }
        else {
            for (WebElement allitem:Choicelist){
                allitem.click();
            }
        }





    }
}
