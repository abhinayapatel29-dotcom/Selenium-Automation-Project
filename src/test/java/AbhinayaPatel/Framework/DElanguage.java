package AbhinayaPatel.Framework;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DElanguage {
    ChromeDriver driver;
    public void opendriver() {
        driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        Assertions.assertThat(driver.getCurrentUrl()).contains("practicesoftwaretesting");
        System.out.println("===== Go to Language Page =====");
    }
    public void DEPage() {
        pagefactorymodel pf = PageFactory.initElements(driver,pagefactorymodel.class);
        waitForPageLoad();
        implicitWait();
        pf.de.click();
        Assertions.assertThat(pf.DE.isDisplayed()).isTrue();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    public void waitForPageLoad() {
        driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
    }

    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void quitdriver() {
        driver.quit();
    }
    @Test
    public void TC004() {
        DElanguage tc = new DElanguage();
        tc.opendriver();
        tc.DEPage();
        tc.quitdriver();
    }
}


