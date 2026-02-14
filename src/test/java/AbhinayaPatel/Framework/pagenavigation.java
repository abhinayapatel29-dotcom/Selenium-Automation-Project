package AbhinayaPatel.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class pagenavigation {
    @Test
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement nxt = driver.findElement(By.xpath("//a[@aria-label='Next']"));
        WebElement pre= driver.findElement(By.xpath("//a[@aria-label='Previous']"));
        WebElement nxtDis = driver.findElement(By.xpath("//a[@aria-label='Next']//parent::li"));
        WebElement preDis = driver.findElement(By.xpath("//a[@aria-label='Previous']//parent::li"));


        while (!nxtDis.getAttribute(("class")).contains("disabled")) {
            nxt.click();
        }
        while(!preDis.getAttribute(("class")).contains("disabled")) {
            pre.click();
        }


        WebElement activepg=driver.findElement(By.xpath("//li[@class='page-item active']//child::a"));
        String pgnbr=activepg.getText();
        System.out.println("Current active page is :"+pgnbr);

    }
}
