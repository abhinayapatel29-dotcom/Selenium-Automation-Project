package AbhinayaPatel.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Hammercount {
    public static void main(String[] args){
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//label[text()=' Hammer ']")).click();
        List<WebElement> elements = driver.findElements(By.className("card-img-wrapper"));
        System.out.println("Total hammers = "+elements.size());
    }
}
