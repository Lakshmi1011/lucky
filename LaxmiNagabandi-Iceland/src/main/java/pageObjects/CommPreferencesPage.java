package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.DriverUtils;

import java.security.PublicKey;

public class CommPreferencesPage
{

    WebDriver driver;


  @FindBy(id="DataProcessingIceMarketing")  public WebElement togglerMarketing;


    public CommPreferencesPage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public String verifyFlag(String attribute)
    {

       return  togglerMarketing.getAttribute(attribute);
    }
}
