package AbhinayaPatel.testNG;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class pliersOutofStock {
    @Test
    public void pos(){
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement search = driver.findElement(By.id("search-query"));
        search.sendKeys("Pliers");
        search.submit();
        Assertions.assertThat(driver.findElement(By.xpath("//span[text()='Out of stock']")).isDisplayed());
    }
}
