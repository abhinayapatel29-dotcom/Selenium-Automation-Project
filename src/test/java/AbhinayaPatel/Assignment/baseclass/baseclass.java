package AbhinayaPatel.Assignment.baseclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
    public static WebDriver driver;
    public void setup(){
        WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
    }
    public static final String url="https://practicesoftwaretesting.com/";

    public void quit(){
        driver.quit();
    }

}
