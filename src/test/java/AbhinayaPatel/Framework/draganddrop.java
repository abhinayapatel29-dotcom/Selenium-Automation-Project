package AbhinayaPatel.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class draganddrop {
    @Test
    public void dragdrop(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement red=driver.findElement(By.xpath("//div[@draggable='true'][1]"));
        WebElement green=driver.findElement(By.xpath("//div[@draggable='true'][2]"));
        WebElement blue=driver.findElement(By.xpath("//div[@draggable='true'][3]"));
        WebElement fill= driver.findElement(By.xpath("//div[@id='target']"));
        driver.manage().window().maximize();
        Actions move=new Actions(driver);
        move.dragAndDrop(blue,fill).build().perform();
        move.dragAndDrop(red,fill).build().perform();
        move.dragAndDrop(green,fill).build().perform();
        System.out.println("All circles droped");
    }
}



