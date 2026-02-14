package AbhinayaPatel.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class iframes {
    public void frames(){
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("abhi_tho_allari");
        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("by");
        driver.switchTo().defaultContent();

        driver.switchTo().frame(2);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("abhipatel");
        driver.switchTo().defaultContent();

        driver.switchTo().frame(3);
        driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("kasthuri");
        driver.switchTo().defaultContent();
    }
}
