package AbhinayaPatel.Framework;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ENlanguage {
    ChromeDriver driver;
    public void opendriver(){
        driver=new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        Assertions.assertThat(driver.getCurrentUrl()).contains("practicesoftwaretesting");
        System.out.println("===== Go to language page =====");
    }
    public void english(){
        pagefactorymodel pf= PageFactory.initElements(driver,pagefactorymodel.class);
        pf.en.click();
        Assertions.assertThat(pf.en.isDisplayed()).isTrue();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }
    public void quitdriver(){
        driver.quit();
    }
    @Test
    public void TC003(){
        ENlanguage el=new ENlanguage();
        el.opendriver();
        el.english();
        el.quitdriver();
    }
}