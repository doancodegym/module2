package thuchanh_sapxepchon;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
       for(int i = 0;i < list.length;i++){
           int min = i;
           for(int j = i + 1;j < list.length;j++){
               if(list[min] > list[j]){
                   min = j;
               }
           }
           if(i != min){
               double temp = list[min];
               list[min] = list[i];
               list[i] = temp;
           }
       }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

}
