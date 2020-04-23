package daonguocmang;
import java.util.ArrayList;
import java.util.Stack;
public class StackArray {
    public static void main(String[] args) {
        //Đảo ngược mảng số nguyên
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        System.out.print("Mảng trước khi đảo ngược: "+arrayList+"\n");
        Stack<Integer> array = new Stack<Integer>();
        while (arrayList.size()>0){
            array.push(arrayList.remove(0));
        }
        while (array.size()>0){
            arrayList.add(array.pop());
        }
        System.out.println("Mảng sau khi đảo ngược : "+arrayList);

        //Đảo ngược mảng chuỗi
        System.out.println("==============================");

        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Một");
        arrayList1.add("Hai");
        arrayList1.add("Ba");
        arrayList1.add("Bốn");
        arrayList1.add("Năm");
        arrayList1.add("Sáu");
        System.out.print("Mảng trước khi đảo ngược: "+arrayList1+"\n");
        Stack<String> array1 = new Stack<String>();
        while (arrayList1.size()>0){
            array1.push(arrayList1.remove(0));
        }
        while (array1.size()>0){
            arrayList1.add(array1.pop());
        }
        System.out.println("Mảng sau khi đảo ngược : "+arrayList1);

    }


}
