package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import lombok.extern.java.Log;
import models.User;
import org.openqa.selenium.support.FindBy;

public class SplashScreen extends ScreenBase{

    public SplashScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@resource-id = 'com.example.svetlana.scheduler:id/app_version_res']")
    MobileElement versionTextView;


    public String getVersion(){
        return versionTextView.getText();
    }


    public LoginScreen checkVersion(String version){
        shouldHave(versionTextView,version,10);
        return new LoginScreen(driver);
    }


}
