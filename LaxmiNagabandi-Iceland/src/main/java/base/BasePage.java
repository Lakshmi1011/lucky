package base;


import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.CommPreferencesPage;
import utils.DriverFactory;
import utils.DriverUtils;

public class BasePage
{
    public static HomePage homePage;
    public static MyAccountPage myAccountPage;
    public static CommPreferencesPage commPreferencesPage;
    public static DriverUtils driverUtils;


    public static void initPages()
    {

        homePage = new HomePage(DriverFactory.driver);
        myAccountPage = new MyAccountPage(DriverFactory.driver);
        commPreferencesPage = new CommPreferencesPage(DriverFactory.driver);
        driverUtils = new DriverUtils();
    }


}
