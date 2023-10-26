package grocerybuy;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class GroceryTestcase extends GroceryUtils {
    String actualmessage=null;

    static Logger logger=Logger.getLogger(GroceryTestcase.class);

    public void login() throws InterruptedException, IOException {

        PageFactory.initElements(driver, Grocerypom.class);
        Thread.sleep(5000);
        Grocerypom.Myaccount.click();
        // logger.info("login account");
        Thread.sleep(2000);
        Grocerypom.mobilenumber.sendKeys(properties.getProperty("number"));

        Grocerypom.loginbutton.click();
    }
    public void signup() throws InterruptedException {


        PageFactory.initElements(driver, Grocerypom.class);


        Thread.sleep(2000);
       // logger.info("signup account");
        Grocerypom.createanaccount.click();
        Grocerypom.userrname.sendKeys(properties.getProperty("name"));
        Grocerypom.phonenumber.sendKeys(properties.getProperty("number"));
        Grocerypom.mail.sendKeys(properties.getProperty("mail"));
        Thread.sleep(1000);
        Grocerypom.Signup.click();

    }
    @Test
    public void otp() throws InterruptedException, IOException {
        login();
        logger.info("login start");
        signup();
      logger.info("account signup");
       // logger.info("otp");
        PageFactory.initElements(driver, Grocerypom.class);
        Grocerypom.otp.sendKeys(properties.getProperty("otp"));
        Grocerypom.Signupbutton.click();
       logger.info("login successfully");
       driver.getTitle();
        Assert.assertEquals("grocery","Grocerybuy");


    }
}