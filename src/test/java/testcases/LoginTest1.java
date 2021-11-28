package testcases;


import org.testng.*;
import org.testng.annotations.*;
import utilities.*;


public class LoginTest1 extends BaseTest {


    @Test
    public void loginTest() {

        openBrowser(ConfigsReader.getProperty("browser"));

        getUrl(ConfigsReader.getProperty("url2"));

        Assert.assertTrue(driver.getTitle()=="sEalam");








         quit();
    }
}
