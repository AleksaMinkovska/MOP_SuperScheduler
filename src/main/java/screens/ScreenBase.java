package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import models.User;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenBase {

    AppiumDriver<MobileElement> driver;

// ***********************   Constructor   ***********************

    public ScreenBase(AppiumDriver<MobileElement> driver) {
        this.driver = driver;

// ***********************   FindBy (annotation pagefactory)  ***********************
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void type(MobileElement element, String text){

        if(text != null){
            element.click();
            element.clear();
            element.sendKeys(text);
        }

    }

    public void should (MobileElement element, int time){
        new WebDriverWait(driver,time)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public void hideKeyBoard(){
        driver.hideKeyboard();
    }


    public void shouldHave(MobileElement element, String text, int time){
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.textToBePresentInElement(element,text));
    }


}
