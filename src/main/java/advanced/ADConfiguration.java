package advanced;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;


//{
//        "deviceName": "Nex",
//        "platformName": "android",
//        "platformVersion": "8.0",
//        "appPackage": "com.h6ah4i.android.example.advrecyclerview",
//        "appActivity": ".launcher.MainActivity"
//        }


public class ADConfiguration {

    protected static AppiumDriver<MobileElement> driver;

    @BeforeSuite
    public void init() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Alex");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("appPackage", "com.h6ah4i.android.example.advrecyclerview");
        capabilities.setCapability("appActivity", ".launcher.MainActivity");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("app", "C:\\Users\\User\\Desktop\\Downloads\\QA_Manual\\apk_files_for_adb\\Advanced RecyclerView Examples_v1.0.0_apkpure.com.apk");

        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


    }


    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
