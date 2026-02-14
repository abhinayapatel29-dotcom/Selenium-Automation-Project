package AbhinayaPatel.Framework;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AllLanguages {
     ChromeDriver driver;
    public void opendriver() {
        driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        Assertions.assertThat(driver.getCurrentUrl()).contains("practicesoftwaretesting");
        System.out.println("====Go to page factory===");
    }
    public void ENlang(){
        pagefactorymodel pf = PageFactory.initElements(driver,pagefactorymodel.class);
        waitForPageLoad();
        implicitwait();
        pf.en.click();
        Assertions.assertThat(pf.en.isDisplayed()).isTrue();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }
    public void DElang(){
        pagefactorymodel pf = PageFactory.initElements(driver,pagefactorymodel.class);
        waitForPageLoad();
        implicitwait();
        pf.de.click();
        Assertions.assertThat(pf.de.isDisplayed()).isTrue();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }
    public void ESlang(){
        pagefactorymodel pf = PageFactory.initElements(driver,pagefactorymodel.class);
        waitForPageLoad();
        implicitwait();
        pf.es.click();
        Assertions.assertThat(pf.es.isDisplayed()).isTrue();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }
    public void FRlang(){
        pagefactorymodel pf = PageFactory.initElements(driver,pagefactorymodel.class);
        waitForPageLoad();
        implicitwait();
        pf.fr.click();
        Assertions.assertThat(pf.fr.isDisplayed()).isTrue();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }
    public void NLlang(){
        pagefactorymodel pf = PageFactory.initElements(driver,pagefactorymodel.class);
        waitForPageLoad();
        implicitwait();
        pf.nl.click();
        Assertions.assertThat(pf.nl.isDisplayed()).isTrue();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }
    public void TRlang(){
        pagefactorymodel pf = PageFactory.initElements(driver,pagefactorymodel.class);
        waitForPageLoad();
        implicitwait();
        pf.tr.click();
        Assertions.assertThat(pf.tr.isDisplayed()).isTrue();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    public void waitForPageLoad(){
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
    }

    public void implicitwait(){
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
    }

    public void quitdriver(){
        driver.quit();
    }
    @Test
    public void TC006(){
        AllLanguages al=new AllLanguages();
        al.opendriver();
        al.ENlang();
        al.DElang();
        al.ESlang();
        al.FRlang();
        al.NLlang();
        al.TRlang();
        al.quitdriver();
    }
}
