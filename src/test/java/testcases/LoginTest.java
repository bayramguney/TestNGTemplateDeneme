package testcases;


import ExtentListeners.*;
import com.aventstack.extentreports.*;
import org.testng.*;
import org.testng.annotations.*;
import utilities.*;


public class LoginTest extends BaseTest {


    @Test
    public void loginTest() {

        openBrowser(ConfigsReader.getProperty("browser"));

        getUrl(ConfigsReader.getProperty("url"));

        ExtentListeners.testReport.get().log(Status.INFO,ConfigsReader.getProperty("url1")+" acildi");


        Assert.assertTrue(driver.getTitle()=="sEalam");







        quit();
    }
}
