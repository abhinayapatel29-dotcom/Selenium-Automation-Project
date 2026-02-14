package AbhinayaPatel.testNG;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class searchcombinationpliers {
    @Test
    public void sc(){
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement search = driver.findElement(By.id("search-query"));
        search.sendKeys("CombinationPliers");
        search.sendKeys(Keys.ENTER);
        List<WebElement> products =
                driver.findElements(By.xpath("//img[contains(@alt,'Combination Pliers')]"));
        System.out.println(products.size());
        WebElement element= driver.findElement(By.xpath("//h5[@data-test='product-name']"));
        String text = element.getText();
        System.out.println(text);
        Assertions.assertThat(text.contains("Combination Pliers"));

    }
}
