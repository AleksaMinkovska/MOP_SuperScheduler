package advancedtests;

import advanced.ADConfiguration;
import advancedscreens.DragScreen;
import org.testng.annotations.Test;

public class SwipeTests extends ADConfiguration {



    @Test
    public void swipeTestLeftRight(){
        new DragScreen(driver)
                .selectSwipe()
                .selectSwipeBasic()
                .swipeFromLeftToRight(3)
                .swipeFromRightToLeft(4);
    }






}
