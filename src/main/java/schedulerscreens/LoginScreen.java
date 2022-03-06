package schedulerscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.User;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginScreen extends ScreenBase{

    public LoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@resource-id = 'com.example.svetlana.scheduler:id/log_email_input']")
    MobileElement emailEditText;

    @FindBy(xpath = "//*[@resource-id = 'com.example.svetlana.scheduler:id/log_password_input']")
    MobileElement passwordEditText;

    @FindBy(xpath = "//*[@resource-id = 'com.example.svetlana.scheduler:id/login_btn']")
    MobileElement loginButton;

    @FindBy(xpath ="//*[@resource-id='android:id/message']")
    MobileElement errorMessage;

    @FindBy(xpath ="//*[@resource-id='android:id/button1']")
    MobileElement okButton;



    public LoginScreen fillEmail(String email){
        //need "wait" after splash screen
        //fill email

        should(emailEditText, 50);
        type(emailEditText, email);
        return this;
    }


    public LoginScreen fillPassword(String password){

        type(passwordEditText, password);
        return this;
    }


    public WizardScreen clickLoginButton(){

        hideKeyBoard();
        loginButton.click();
        return new WizardScreen(driver);
    }


// ******************    Home Work    ******************
//    public void complexLogin(User user){
//
//        fillEmail(user.getEmail());
//        fillPassword(user.getPassword());
//        clickLoginButton();
//
//    }

// ******************   CLASS WORK  ******************
    public WizardScreen complexLoginNEW(User user){
        should(emailEditText,50);
        type (emailEditText,user.getEmail());
        type(passwordEditText,user.getPassword());
        hideKeyBoard();
        loginButton.click();

        return new WizardScreen(driver);
    }


    public boolean isLoginButtonPresent(){

        return loginButton.isDisplayed();
    }


    public LoginScreen loginWithErrorMessage(User user){

        should(emailEditText,50);
        type (emailEditText,user.getEmail());
        type(passwordEditText,user.getPassword());
        hideKeyBoard();
        loginButton.click();

        return this;
    }


    public LoginScreen checkErrorMessage(String text){

        shouldHave(errorMessage, text, 50);
        return this;
    }

    public LoginScreen confirmErrorMessage(){

        okButton.click();
        return this;

    }

    public LoginScreen isLoginButtonAssert(){

        should(loginButton, 50);
        Assert.assertTrue((loginButton.isDisplayed()));

        return this;
    }
}
