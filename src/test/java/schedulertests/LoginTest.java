package schedulertests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import scheduler.MyDataProvider;
import scheduler.SSConfiguration;
import schedulerscreens.HomeScreen;
import schedulerscreens.LoginScreen;

public class LoginTest extends SSConfiguration {


    @Test
    public void loginSuccessTest(){
//        new SplashScreen(driver)
//                .checkVersion("0.0.3")    // check only one time in LaunchTest

        boolean isPlusButtonPresent = new LoginScreen(driver)
                .fillEmail("wick@gmail.com")
                .fillPassword("Ww12345$")
                .clickLoginButton()
                .skipWizard()

                .isPlusButtonPresent();

        Assert.assertTrue(isPlusButtonPresent);


        boolean isLoginButtonPresent = new HomeScreen(driver)
                .openMenu()
                .logOut()
                .isLoginButtonPresent();

        Assert.assertTrue(isLoginButtonPresent);

    }



// ******************    Home Work   ******************
//    @Test
//
//    public void loginSuccessModel(){
//
//        User user = User.builder()
//                .email("wick@gmail.com")
//                .password("Ww12345$")
//                .build();
//
//        new LoginScreen(driver).complexLogin(user);
//    }

// ****************** CLASS ******************

    @Test
    public void loginSuccessCOMPLEX(){

        boolean isLoginButtonPresent = new LoginScreen((driver))
                .complexLoginNEW(User.builder().email("wick@gmail.com").password("Ww12345$").build())
                .skipWizard()
                .openMenu()
                .logOut()
                .isLoginButtonPresent();

        Assert.assertTrue(isLoginButtonPresent);
    }



    @Test    // registration TEST
    public void registrationSuccess(){

        int index = (int)(System.currentTimeMillis()/1000%3600);

        boolean isLoginButtonPresent = new LoginScreen(driver)
                .complexLoginNEW(User.builder().email("wick"+index+"@gmail.com").password("Ww12345$").build())
                .skipWizard()
                .openMenu()
                .logOut()
                .isLoginButtonPresent();


        Assert.assertTrue(isLoginButtonPresent);


    }


    @Test
    public void loginErrorMessage(){

        boolean isLoginButtonPresent = new LoginScreen(driver)

                .loginWithErrorMessage(User.builder().email("wick@gmail.com").password("Ww54321$").build())
                .checkErrorMessage("Wrong email or password")
                .confirmErrorMessage()
                .isLoginButtonPresent();

        Assert.assertTrue(isLoginButtonPresent);
    }



//  *********************  Data Provider  *********************


    @Test(dataProvider = "loginValidData", dataProviderClass = MyDataProvider.class)

    public void loginSuccessDataProvider(String email, String password){

        boolean isPlusButtonPresent = new LoginScreen(driver)

                .fillEmail(email)
                .fillPassword(password)
                .clickLoginButton()
                .skipWizard()
                .isPlusButtonPresent();

        Assert.assertTrue(isPlusButtonPresent);

    }


}
