package AbhinayaPatel.Assignment.TestData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagefactory {
    @FindBy(id = "first_name")
    public WebElement firstname;
    @FindBy(id = "last_name")
    public WebElement lastname ;
    @FindBy(id = "dob")
    public WebElement dob ;
    @FindBy(id = "street")
    public WebElement street;
    @FindBy(id = "postal_code")
    public WebElement postalcode;
    @FindBy(id = "city")
    public WebElement city;
    @FindBy(id = "state")
    public WebElement state ;
    @FindBy(linkText = "country")
    public WebElement country;
    @FindBy(id = "phone")
    public WebElement phone ;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "country")
    public WebElement countrydropdown;
}
