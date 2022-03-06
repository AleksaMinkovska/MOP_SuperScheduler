package advancedtests;

import advanced.ADConfiguration;
import advancedscreens.DragScreen;
import org.testng.annotations.Test;

public class DragTests extends ADConfiguration {


    @Test
    public void dragDownTest(){
        new DragScreen(driver)
                .selectDraggableBasic()
                .dragDown(3);
    }


    @Test
    public void dragUpTest(){
        new DragScreen(driver)
                .selectDraggableBasic()
                .dragUp(6, 3);

    }


    @Test
    public void dragDownAllWindow(){
        new DragScreen(driver)
                .selectDraggableBasic()
                .dragDownAllWindow(1);
    }


}
