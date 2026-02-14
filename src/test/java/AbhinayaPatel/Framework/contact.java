package AbhinayaPatel.Framework;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
@Test
public class contact {
    public void gotocontact(){
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.findElement(By.linkText("Contact")).click();
        Assertions.assertThat(driver.getCurrentUrl().contains("Contact"));
    }
}
