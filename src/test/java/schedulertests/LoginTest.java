package schedulertests;

import models.User;
import org.testng.annotations.Test;
import scheduler.SSConfiguration;
import screens.LoginScreen;
import screens.SplashScreen;

public class LoginTest extends SSConfiguration {


    @Test
    public void loginSuccessTest(){
        new SplashScreen(driver)
                .checkVersion("0.0.3")
                .fillEmail("wick@gmail.com")
                .fillPassword("Ww12345$")
                .clickLoginButton();

    }





// ******************    Home Work   ******************
    @Test

    public void loginSuccessModel(){

        User user = User.builder()
                .email("wick@gmail.com")
                .password("Ww12345$")
                .build();

        new LoginScreen(driver).complexLogin(user);
    }
}
