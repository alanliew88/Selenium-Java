import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ThirdTestCase {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/alanliew/Downloads/Driver and Jar file/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https:google.com");

        String actualtitle = driver.getTitle();
        String expectedtitle = "Google";

        if (actualtitle.equalsIgnoreCase(expectedtitle)){
            System.out.println("navigated to correct page");
        }else {
            System.out.println("Error : Test Case Failed");
        }

        String actualurl = driver.getCurrentUrl();
        String expectedurl = "https://www.google.com/";

        System.out.println(actualurl);

        if (actualurl.equalsIgnoreCase(expectedurl)){
            System.out.println("Google.com");
            driver.close();

        }else{
            System.out.println("Error: Test Case Failed ");
        }






    }
}
