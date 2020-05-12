package adapter;

import com.codegym.CollectionUtils;


import java.util.*;

public class CollectionUtilsAdapter implements CollectionAdapter {

    @Override
    public int findMax(Set<Integer> setArray) {
        List<Integer> myList = setToListAdapter(setArray);
        int max = new CollectionUtils().findMax(myList);
        return max;
    }

    private List<Integer> setToListAdapter (Set<Integer> setArray){
        List<Integer> mylist = new ArrayList<>();
        if(setArray.isEmpty()){
            mylist = new ArrayList<>();
        }else {
            Iterator<Integer> iterator = setArray.iterator();
            while (iterator.hasNext()) {
                mylist.add(iterator.next());
            }

        }
        return mylist;
    }

}