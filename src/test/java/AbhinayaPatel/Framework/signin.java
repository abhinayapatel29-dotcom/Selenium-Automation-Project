package AbhinayaPatel.Framework;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class signin {
    public void gotosingin() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Sign in")).click();
         Assertions.assertThat(driver.getTitle().contains("Login"));
    }
}

