package steps;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.DriverFactory;

public class Hooks
{

    @Before
    public void setUp()
    {
        DriverFactory.getDriver();
    }


    @After
    public void tearDown(Scenario scenario)
    {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) DriverFactory.driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        DriverFactory.closeDriver();
    }


}
