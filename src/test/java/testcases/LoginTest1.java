package testcases;


import ExtentListeners.*;
import com.aventstack.extentreports.*;
import org.testng.*;
import org.testng.annotations.*;
import utilities.*;


public class LoginTest1 extends BaseTest {


    @Test
    public void loginTest() {

        openBrowser(ConfigsReader.getProperty("browser"));

        getUrl(ConfigsReader.getProperty("url2"));

        ExtentListeners.testReport.get().log(Status.INFO,ConfigsReader.getProperty("url2")+" acildi");

        Assert.assertTrue(driver.getTitle()=="sEalam");








         quit();
    }
}
