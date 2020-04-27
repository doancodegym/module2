package timkiemnhiphandequy;

import java.util.Scanner;

public class BinarySearch {

    public int find(int[] sortedValues, int value) {
        return search(sortedValues, value, 0, sortedValues.length - 1);
    }

    private int search(int[] sorted, int value, int leftIndex, int rightIndex) {

        // 1. index check
        if (leftIndex > rightIndex) {
            return -1;
        }

        // 2. Tìm vị trí giữa
        int mid = (rightIndex + leftIndex) / 2;

        // 3. Gọi đệ quy
        if (sorted[mid] > value) {
            return search(sorted, value, leftIndex, mid - 1);
        } else if (sorted[mid] < value) {
            return search(sorted, value, mid + 1, rightIndex);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        BinarySearch binary = new BinarySearch();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng : ");
        int size = input.nextInt();
        int[] binaryArray = new int[size];
        for(int i = 0;i < binaryArray.length;i++){
            System.out.print("Nhập phần tử số "+ i + " : ");
            binaryArray[i] = input.nextInt();
        }
        System.out.println("===========================");
        System.out.println("Nhập giá trị muốn tìm : ");
        int value = input.nextInt();
        System.out.println("===========================");
        System.out.println(value+" ở vị trí số " + binary.find(binaryArray,value) + " trong mảng.");;

    }
}
