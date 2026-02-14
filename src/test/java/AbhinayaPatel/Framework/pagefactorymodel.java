package AbhinayaPatel.Framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagefactorymodel {

    @FindBy(id = "language")
    public WebElement languageDropdown;

    @FindBy(xpath = "//a[@data-test='lang-de']")
    public WebElement DE;
    @FindBy(xpath = "//button[@aria-hidden='true']")
    public WebElement de;
    @FindBy(xpath = "//button[@aria-hidden='true']")
    public WebElement en;
    @FindBy(xpath = "//button[@aria-hidden='true']")
    public WebElement es;
    @FindBy(xpath = "//button[@aria-hidden='true']")
    public WebElement fr;
    @FindBy(xpath = "//button[@aria-hidden='true']")
    public WebElement nl;
    @FindBy(xpath = "//button[@aria-hidden='true']")
    public WebElement tr;
}
