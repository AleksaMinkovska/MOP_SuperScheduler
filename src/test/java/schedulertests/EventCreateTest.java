package schedulertests;

import models.Event;
import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import scheduler.SSConfiguration;
import schedulerscreens.HomeScreen;
import schedulerscreens.LoginScreen;

public class EventCreateTest extends SSConfiguration {


    @BeforeMethod

    public void preCondition(){

        new LoginScreen(driver)
                .complexLoginNEW(User.builder().email("wick@gmail.com").password("Ww12345$").build());

    }


    @Test
    public void createNewEventTest(){

        boolean isEventCreated = new HomeScreen(driver)
                .creationEvent()
                .createNewEvent(Event.builder()
                        .title("New")
                        .type("Event")
                        .breaks(3)
                        .wage(60).build())

                .isPlusButtonPresent();

        Assert.assertTrue(isEventCreated);

    }


    @Test
    public void createNewEventTestAssert(){
        Event event = Event.builder().title("Holly").type("Land").breaks(2).wage(50).build();

        new HomeScreen(driver)
                .creationEvent()
                .createNewEvent(event)
                .isPlusButtonPresentAssert()
                .openMenu()
                .logOut()
                .isLoginButtonAssert();
    }
}
