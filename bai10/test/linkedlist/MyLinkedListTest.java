package linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    MyLinkedList myLinkedList;
    @BeforeEach
    public void setLinkedList(){
        myLinkedList= new MyLinkedList(9);
        myLinkedList.addFirst(8);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(6);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);
    }

    @Test
    @DisplayName("Test .addFirst()")
    void addFirst() {
        myLinkedList.addFirst(0);
        String expected = "0 1 2 3 4 5 6 7 8 9 ";
        String result = myLinkedList.toString();
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test .add(index, data)")
    void add() {
        myLinkedList.add(4,99);
        String expected = "1 2 3 4 99 5 6 7 8 9 ";
        String result = myLinkedList.toString();
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test .remove()")
    void remove() {
        int[] myArray = {8,0,-2};
//        myLinkedList.remove(myArray[0]);
        assertEquals(9,myLinkedList.remove(myArray[0])); //Last remove
        assertEquals(1,myLinkedList.remove(myArray[1]));//First remove
        assertEquals(null,myLinkedList.remove(myArray[2])); //out of numNodes

    }

    @Test
    @DisplayName("Test .toString()")
    void testToString() {
        String expected = "1 2 3 4 5 6 7 8 9 ";
        String result = myLinkedList.toString();
        assertEquals(expected,result);

    }

    @Test
    @DisplayName("Test .getSize()")
    void getSize() {
        assertEquals(9,myLinkedList.getSize());
    }
    @Test
    @DisplayName("Test .contain()")
    void contain() {
        for(int i = 1;i<10;i++){
            assertTrue(myLinkedList.contain(i));
        }
    }

    @Test
    @DisplayName("Test .indexOf()")
    void indexOf() {
        int[] myArray = {8,-2};
        assertEquals(7,myLinkedList.indexOf(myArray[0]));
        assertEquals(-1,myLinkedList.indexOf(myArray[1]));
    }
}