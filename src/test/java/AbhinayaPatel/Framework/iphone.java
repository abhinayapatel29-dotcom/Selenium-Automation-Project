package AbhinayaPatel.Framework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Test
public class iphone {
    public void iphone(){
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=1601864685268668157&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062127&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
        driver.findElement(By.xpath("//div[@id='sac-suggestion-row-1']//child::div//child::div")).click();
        List<WebElement> ip=driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        int no_of_phones=ip.size();
        System.out.println("total iphones ="+ no_of_phones);
    }
}
