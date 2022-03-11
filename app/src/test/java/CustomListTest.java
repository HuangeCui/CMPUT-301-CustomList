import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax","NS"));
        assertEquals(listSize+1,list.getCount());
    }

    @Test
    public void hasCityTest(){
        City city = new City("Toronto","ON");

        list.addCity(city);

        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteTest(){

        City city = new City("Edmonton","AB");

        list.addCity(city);
        assertEquals(1,list.getCount());
        list.deleteCity(city);
        assertEquals(0,list.getCount());

        assertFalse(list.hasCity(city));

    }

    @Test
    public void countCityTest(){
        City city = new City("Vancouver","BC");
        list.addCity(city);

        assertEquals(1,list.countCity(),list.getCount());
    }
}
