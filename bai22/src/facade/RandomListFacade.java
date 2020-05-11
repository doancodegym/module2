package facade;

import java.util.List;

public class RandomListFacade {
    public void  printRandomEvenList(){
        RandomList randomList = new RandomList();
        ListFilter listFilter = new ListFilter();
        List<Integer> num = listFilter.filterOdd(randomList.generateList(20,1,30));
        ListPrinter listPrinter = new ListPrinter();
        listPrinter.printList(num);
    }
}
