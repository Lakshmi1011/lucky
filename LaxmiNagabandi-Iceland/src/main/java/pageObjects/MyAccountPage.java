package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class MyAccountPage
{
    WebDriver driver;


    @FindBy(linkText = "Communication preferences") public WebElement communicationPrefs ;


    public MyAccountPage(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }


    public void clickCommPreferences()
    {

        DriverUtils.click(communicationPrefs);

    }

}
