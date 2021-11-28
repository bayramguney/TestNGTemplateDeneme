package testcases;


import org.testng.*;
import org.testng.annotations.*;
import utilities.*;


public class LoginTest3 extends BaseTest {


    @Test
    public void loginTest() {

        openBrowser(ConfigsReader.getProperty("browser"));

        getUrl(ConfigsReader.getProperty("url4"));

        Assert.assertTrue(driver.getTitle()=="sEalam");








         quit();
    }
}
