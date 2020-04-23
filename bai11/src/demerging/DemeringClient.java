package demerging;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DemeringClient {
    public static void main(String[] args) {
        String[][] listPersion = {
                {"Nguyễn Văn Nam", "Nam", "20/10/1990"},
                {"Phạm Thị Thúy", "Nữ", "03/05/1993"},
                {"Dương Minh Hà", "Nam", "11/06/1994"},
                {"Lê Thúy Hằng", "Nữ", "02/01/1995"},
                {"Nguyễn Thu Trang", "Nữ", "23/12/1998"}
        };
        Queue male = new LinkedList();
        Queue female = new LinkedList();
        for (int i = 0;i<listPersion.length;i++){
            if(listPersion[i][1] == "Nữ"){
                female.add(listPersion[i][0]);
            }else {
                male.add(listPersion[i][0]);
            }
        }
        Object[] output = new String[listPersion.length];
        for(int i = 0 ;i < output.length;i++){
            while (! female.isEmpty()){
                output[i] = female.poll();
                i++;
            }
            while (! male.isEmpty()){
                output[i] = male.poll();
                i++;
            }

        }
        System.out.println(Arrays.toString(output));

    }
}
