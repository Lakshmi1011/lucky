package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtils;

public class HomePage
{
    WebDriver driver;
    WebDriverWait wait;

    //locators
    @FindBy(className = "user-account") public WebElement signInLink;

    @FindBy(id="dwfrm_login_username") public WebElement emailTextBox;

    @FindBy(id="dwfrm_login_password") public WebElement passwordTextBox;

    @FindBy(name = "dwfrm_login_login") public WebElement signInSecurelyBtn;

    @FindBy(linkText = "Welcome back, Laxmi") public WebElement welcomeBackLink;

    @FindBy(xpath = "//a[@title='Go to: My Account']") public WebElement myAccountLink;


   public HomePage(WebDriver driver)
   {
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }

    //actions
    public void clickSignInLink()
    {

       DriverUtils.click(signInLink);
    }

    public void enterEmail(String em)
    {

        DriverUtils.type(emailTextBox,em);
    }

    public void enterPassword(String pw)
    {

        DriverUtils.type(passwordTextBox,pw);
    }

    public void clickSignInSecurelyButton()
    {

        DriverUtils.click(signInSecurelyBtn);
    }

    public String  verifySignIn() throws InterruptedException {
        Thread.sleep(2000);
       return DriverUtils.getElementText(welcomeBackLink);
    }

    public void clickWelcomeBackLink() throws InterruptedException {
        Thread.sleep(2000);
        DriverUtils.click(welcomeBackLink);
    }

    public void clickMyAccountLink()
    {
        DriverUtils.click(myAccountLink);
    }

}
