package AbhinayaPatel.Assignment.Testcase;

import AbhinayaPatel.Assignment.Pages.Registrationpage;
import AbhinayaPatel.Assignment.Pages.loginpage;
import AbhinayaPatel.Assignment.TestData.pagefactory;
import AbhinayaPatel.Assignment.baseclass.baseclass;
import AbhinayaPatel.Framework.signin;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class TC001_CustomerRegistration extends baseclass {
    public void open() {
        setup();
        driver.get(url);
        driver.manage().window().maximize();
    }
    public void signin() {
        loginpage lp = PageFactory.initElements(driver, loginpage.class);
        lp.signIn.click();
    }
    public void Registrationpage(){
        Registrationpage rp=PageFactory.initElements(driver,Registrationpage.class);
        rp.Register.click();
    }
    public void prop(){
        pagefactory pf=PageFactory.initElements(driver, pagefactory.class);
        pf.firstname.sendKeys("Abhi");
        pf.lastname.sendKeys("Patel");
        pf.dob.sendKeys("29-11-2004");
        pf.street.sendKeys("Ameerpet");
        pf.postalcode.sendKeys("505404");
        pf.city.sendKeys("Hyd");
        pf.state.sendKeys("Telengana");
        Select sc= new Select(pf.countrydropdown);
        sc.selectByVisibleText("India");
        pf.phone.sendKeys("7569939295");
        pf.password.sendKeys("@29abhi11");
        pf.email.sendKeys("abhinayapatel29@gmail.com");
    }

    @Test
    public void CustomerRegistration(){
        TC001_CustomerRegistration cr=new TC001_CustomerRegistration();
        cr.open();
        cr.signin();
        cr.prop();
    }
}
