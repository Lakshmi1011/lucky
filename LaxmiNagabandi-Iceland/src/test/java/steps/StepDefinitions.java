package steps;

import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions
{

    @Given("I navigate to url {string}")
    public void i_navigate_to_url(String url)
    {
        BasePage.driverUtils.navigateToUrl(url);
    }

    @Then("I should be navigated to home page")
    public void i_should_be_navigated_to_home_page()
    {
         String homepageTitle = BasePage.driverUtils.getPageTitle();
         System.out.println("Home Page Title is: "+homepageTitle);
    }

    @When("I click on signin link")
    public void i_click_on_signin_link()
    {
        BasePage.homePage.clickSignInLink();
    }

    @When("I enter email as {string}")
    public void i_enter_email_as(String email)
    {
       BasePage.homePage.enterEmail(email);
    }

    @When("I enter password as {string}")
    public void i_enter_password_as(String password)
    {
       BasePage.homePage.enterPassword(password);
    }

    @When("I click on signinsecurely button")
    public void i_click_on_signinsecurely_button()
    {
        BasePage.homePage.clickSignInSecurelyButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() throws InterruptedException {
       String welcomeMsg =  BasePage.homePage.verifySignIn();
        System.out.println("Welcome message is: "+welcomeMsg);
    }

    @When("I click on welcome back link")
    public void i_click_on_welcome_back_link() throws InterruptedException
    {
       BasePage.homePage.clickWelcomeBackLink();
    }

    @When("I click on my account link")
    public void i_click_on_my_account_link()
    {
        BasePage.homePage.clickMyAccountLink();
    }

    @Then("I should be navigated to account details page")
    public void i_should_be_navigated_to_account_details_page()
    {
        String accountDetailsPageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println("Account Details Page Title is: "+accountDetailsPageTitle);
    }

    @When("I click on communication preferences link")
    public void i_click_on_communication_preferences_link()
    {
          BasePage.myAccountPage.clickCommPreferences();
    }

    @Then("I should be navigated to update communication preferences page")
    public void i_should_be_navigated_to_update_communication_preferences_page()
    {
        String communicationprefPageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println("Communication Preferences Page Title is: "+ communicationprefPageTitle);
    }

    @Then("Iceland marketing toggler should be set to true")
    public void iceland_marketing_toggler_should_be_set_to_true()
    {
        String verifyFlag = BasePage.commPreferencesPage.verifyFlag("checked");
        System.out.println("Flag is set to: "+verifyFlag);

    }



}
