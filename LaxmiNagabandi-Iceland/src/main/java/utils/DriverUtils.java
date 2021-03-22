package utils;



import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;


public class DriverUtils
{
    public static String text;

    public void navigateToUrl(String url)
    {
       DriverFactory.driver.navigate().to(url);
    }
    public String getPageTitle()
    {
        return  DriverFactory.driver.getTitle();
    }

    public void pageRefresh()
    {
       DriverFactory.driver.navigate().refresh();
    }

    /****************click,getElementText,type **********************/

    //click
    public static void click(WebElement element)
    {
        try{

            element.click();

        }catch(Exception e)
        {
            e.printStackTrace();
            Assertions.fail();
        }
    }

    //type
    public static void type(WebElement element,String data){
        try{
            element.sendKeys(data);
        }catch(Exception e){

            e.printStackTrace();
            Assertions.fail();
        }
    }
    // getText
    public static String getElementText(WebElement element)
    {
        try
        {
            text = element.getText();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assertions.fail();
        }

        return text;
    }

}
