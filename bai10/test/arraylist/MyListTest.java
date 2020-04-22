package arraylist;

import arraylist.MyList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


class MyListTest {
    MyList myArrayList;
    @BeforeEach
    public void setMyArrayList(){
        myArrayList = new MyList(10);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);
    }

    @Test
    @DisplayName("Test .getLength")
    void getLength() {
        int expected = 10;
        int result = myArrayList.getLength();
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test .add(E)")
    void add() {
        String expected = "1 2 3 4 5 6 7 8 9 null ";
        String result = myArrayList.toString();
        assertEquals(expected,result);

    }

    @Test
    @DisplayName("Test getSize")
    void getSize() {
        int expected = 9;
        int result = myArrayList.getSize();
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test setSide()")
    void setSize() {
        myArrayList.setSize(7);
        int expected = 7;
        int result = myArrayList.getSize();
        assertEquals(expected,result);
    }


    @Test
    @DisplayName("Test .remove()")
    void remove() {
        String expected = "4";
        String result = String.valueOf(myArrayList.remove(3));
        assertEquals(result,expected);
    }


    @Test
    @DisplayName("Test .clear()")
    void clear() {
        myArrayList.clear();
        String expected = "null null null null null null null null null null ";
        String result = myArrayList.toString();
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test .get()")
    void get(){
        int expected = 3;
        int result = (int) myArrayList.get(2);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test .contains()")
    void contains() {
        assertTrue(myArrayList.contains(5));
    }

    @Test
    @DisplayName("Test .indexOf()")
    void indexOf() {
        assertEquals(-1,myArrayList.indexOf(10));
    }

    @Test
    @DisplayName("Test .ensureCapacity()")
    void ensureCapacity() {
        String expected = "1 2 3 4 5 6 7 8 9 null null null null null null null null null null null ";
        myArrayList.ensureCapa();
        String result = myArrayList.toString();
        assertEquals(expected,result);
    }
}