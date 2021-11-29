package testcases;


import ExtentListeners.*;
import com.aventstack.extentreports.*;
import org.testng.*;
import org.testng.annotations.*;
import utilities.*;


public class LoginTest2 extends BaseTest {


    @Test
    public void loginTest() {

        openBrowser(ConfigsReader.getProperty("browser"));

        getUrl(ConfigsReader.getProperty("url3"));

        ExtentListeners.testReport.get().log(Status.INFO,ConfigsReader.getProperty("url3")+" acildi");


        Assert.assertTrue(driver.getTitle()=="sEalam");








         quit();
    }
}
