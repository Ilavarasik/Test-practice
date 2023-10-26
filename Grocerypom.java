package grocerybuy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pom.Homepageobjects;

public class Grocerypom {


    //login
    @FindBy(xpath ="//button[text()='My Account']")
    public static WebElement Myaccount;
    //mobile number
    @FindBy(xpath="//input[@placeholder='Enter your mobile number']")
    public static WebElement mobilenumber;

    //login button
       @FindBy( xpath=("//button[text()='Login']"))
       public static WebElement loginbutton;

    //create an account
     @FindBy(xpath="//span[@class='text-decoration-underline']")
     public static WebElement createanaccount;

    //name
      @FindBy(xpath="//input[@placeholder='Enter your Name']")
              public static WebElement userrname;
     //mobilenumber
    @FindBy(xpath = "//input[@placeholder='Enter your mobile number']")
    public static WebElement phonenumber;
    //mail

     @FindBy(xpath="//input[@placeholder='Enter your Email']")////input[@placeholder='Enter your Email']
     public static WebElement mail;
    //sign up
     @FindBy (xpath="//button[text()='Sign up']")
     public static WebElement Signup;

    //otp
      @FindBy( xpath="//input[@autocomplete='one-time-code']")
              public static WebElement otp;
      //signup
        @FindBy(xpath="//button[@class='signup__button']")
        public static WebElement Signupbutton;
    //signup
}



