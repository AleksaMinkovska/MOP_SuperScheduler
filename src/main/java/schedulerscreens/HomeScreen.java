package schedulerscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class HomeScreen extends ScreenBase {

    public HomeScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    Logger logger = LoggerFactory.getLogger(HomeScreen.class);


    @FindBy(xpath = "//*[@resource-id = 'com.example.svetlana.scheduler:id/fab_main']")
    MobileElement plusAdd;

    @FindBy(xpath = "//*[@content-desc = 'Open']")
    MobileElement burgerMenu;

    @FindBy(xpath = "//*[@resource-id = 'com.example.svetlana.scheduler:id/nav_fr_logout']")
    MobileElement logOut;

    @FindBy(xpath = "//*[@resource-id = 'com.example.svetlana.scheduler:id/fab_add_event']")
    MobileElement addEventButton;


    public boolean isPlusButtonPresent() {

        should(plusAdd, 15);
        return plusAdd.isDisplayed();
    }

    public HomeScreen isPlusButtonPresentAssert() {

        should(plusAdd, 20);
        Assert.assertTrue(plusAdd.isDisplayed());

        return this;
    }

    public HomeScreen openMenu(){

        burgerMenu.click();
        return this;
    }

    public LoginScreen logOut(){

        logOut.click();
        return new LoginScreen(driver);
    }


    public EditCreateEventScreen creationEvent(){

        should(plusAdd, 50);
        plusAdd.click();
        addEventButton.click();

        return new EditCreateEventScreen(driver);

    }


}
