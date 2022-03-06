package scheduler;


//{
//        "platformName": "Android",
//        "deviceName": "Nex",
//        "platformVersion": "8.1",
//        "appPackage": "com.example.svetlana.scheduler",
//        "appActivity": ".presentation.splashScreen.SplashScreenActivity"
//        }


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.net.MalformedURLException;
import java.net.URL;

public class SSConfiguration {

    protected static AppiumDriver<MobileElement> driver;
    protected Logger logger = LoggerFactory.getLogger(SSConfiguration.class);

    @BeforeSuite
    public void setUp() throws MalformedURLException {

        logger.info("POM - TESTS starts in Android emulator @Alex / SuperScheduler ");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Alex");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("appPackage", "com.example.svetlana.scheduler");
        capabilities.setCapability("appActivity", ".presentation.splashScreen.SplashScreenActivity");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("app", "C:\\Users\\User\\Desktop\\Downloads\\QA_Manual\\apk_files_for_adb\\v.0.0.3.apk");

        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }


    @AfterSuite
    public void tearDown(){
        //driver.quit();
    }

}
