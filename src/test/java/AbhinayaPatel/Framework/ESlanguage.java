package AbhinayaPatel.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
@Test
public class ESlanguage {
    public void ESlang(){
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@data-test='language-select']")).click();
        driver.findElement(By.xpath("//a[@data-test='lang-es']")).click();
        driver.quit();
    }
}
