package thuchanhtimkiemnhiphan;

import java.util.Scanner;

public class BinarySearch {
    static int[] array={2,4,5,6,8,9,12,23,26,37,69,77};
    static int search(int[] array,int key){
        int low = 0;
        int hight = array.length - 1;
        while (hight>=low){
            int mid = (low + hight)/2;
            if(key < array[mid]){
                hight = mid - 1;
            }else if(key > array[mid]){
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập giá trị muốn tìm : ");
        int key = input.nextInt();
        System.out.println(key + " ở vị trí thứ " + search(array, key) + " trong mảng !");

    }
}
