package bubble_sort_by_step;

public class BubbleSortByStep {

    public static void bubbleSort(int[]list){
        for(int i = 0;i < list.length;i++){
            for (int j = i+1;j < list.length;j++){
                if(list[i]>list[j]){
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {10,3,15,6,9,13,11,54,4,8};
        BubbleSortByStep.bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
