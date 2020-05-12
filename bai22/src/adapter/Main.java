package adapter;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(88);
        mySet.add(19);
        mySet.add(6);
        CollectionUtilsAdapter adapter = new CollectionUtilsAdapter();

        int maxNumber = adapter.findMax(mySet);
        System.out.println("Max number of list: "+maxNumber);
    }
}