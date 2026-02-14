package AbhinayaPatel.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
@Test
public class alert {
    public void alert(){
        WebDriver driver = new ChromeDriver();
        String file = System.getProperty("user.dir")+"//src//test//java//selenium//test.html";
        driver.get(file);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement button=driver.findElement(By.xpath("//button[@id='button']"));
        button.click();
        try {
            driver.switchTo().alert().accept();
            System.out.println("Alert");
        }
        catch (Exception e){
            System.out.println("Not found");
        }
        driver.quit();
    }
}
