package sapxep_chen;

import bubble_sort_by_step.BubbleSortByStep;

public class InsertionSort {
    public static void insertSort(int[] list){
        int[] sortList = new int[list.length];
        int key;
        for(int i = 1;i < list.length;i++) {
            key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key){
                list[j + 1] = list[j];
                j = j -1 ;
            }
            list[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] list = {10,3,15,6,9,13,11,54,4,8};
        InsertionSort.insertSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
