package AbhinayaPatel.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import javax.swing.*;
import java.util.concurrent.TimeUnit;
@Test
public class chatbox {
    public void chat()throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@aria-label='Open chat']")).click();
        driver.findElement(By.xpath("//button[@data-test='chat-action-find-product']")).click();
        driver.findElement(By.xpath("//input[@data-test='chat-input']")).sendKeys("Namastey");
        WebElement enter=driver.findElement(By.xpath("//button[@aria-label='Send message']"));
        enter.click();


    }
}
