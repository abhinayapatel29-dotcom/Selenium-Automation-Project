package AbhinayaPatel.Framework;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class dropdown {
    public static void main(String[] args){
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        homepage hp =new homepage();
        createnewaccpage cap =new createnewaccpage();
        driver.findElement(hp.createnewacc).click();

        Select day = new Select(driver.findElement(cap.dayDropDown));
        Select month = new Select(driver.findElement(cap.monthDropDown));
        Select year =new Select(driver.findElement(cap.yearDropDown));

          System.out.println(day.getFirstSelectedOption().getText());

        day.selectByValue("29");
        month.selectByValue("11");
        year.selectByVisibleText("2004");

        System.out.println(day.isMultiple());
        List<WebElement> option=day.getOptions();
        System.out.println(option.size());
    }
}
