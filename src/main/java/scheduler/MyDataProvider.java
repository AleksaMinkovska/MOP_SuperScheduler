package scheduler;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyDataProvider {


    @DataProvider
    public Iterator<Object[]> loginValidData(){

        List<Object[]> list = new ArrayList<>();

        list.add(new Object[]{"wick@gmail.com", "Ww12345$"});
        list.add(new Object[]{"wick@gmail.com", "Ww12345$"});

        return list.iterator();
    }



    @DataProvider
    public Iterator<Object[]> createEvent(){

        List<Object[]> list = new ArrayList<>();

        return list.iterator();
    }

}
