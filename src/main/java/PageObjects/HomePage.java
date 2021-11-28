package PageObjects;


import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }

    @FindBy(xpath = "//span[normalize-space()='Assign Leave']")
    public WebElement assignLeave;















}
