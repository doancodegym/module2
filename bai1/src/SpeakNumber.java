import java.util.Scanner;

public class SpeakNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scanner.nextInt();
        switch (num){
            case 0 :
                System.out.println("Không");
                break;
            case 1 :
                System.out.println("Một");
                break;
            case 2 :
                System.out.println("Hai");
                break;
            case 3 :
                System.out.println("Ba");
                break;
            case 4 :
                System.out.println("Bốn");
                break;
            case 5 :
                System.out.println("Năm");
                break;
            case 6 :
                System.out.println("Sáu");
                break;
            case 7 :
                System.out.println("Bảy");
                break;
            case 8 :
                System.out.println("Tám");
                break;
            case 9 :
                System.out.println("Chín");
                break;
            case 10 :
                System.out.println("Mười");
                break;
        }
        if(num >10){
            int units = num % 10;
            int tens = (num/10)%10;
            int hunds = num/100;
            String spell_num="";
            switch (hunds){
                case 1:
                    spell_num+="Một trăm ";
                    break;
                case 2:
                    spell_num+="Hai trăm ";
                    break;
                case 3 :
                    spell_num+="Ba trăm ";
                    break;
                case 4 :
                    spell_num+="Bốn trăm ";
                    break;
                case 5 :
                    spell_num+="Năm trăm ";
                    break;
                case 6 :
                    spell_num+="Sáu trăm ";
                    break;
                case 7 :
                    spell_num+="Bảy trăm ";
                    break;
                case 8 :
                    spell_num+="Tám trăm ";
                    break;
                case 9 :
                    spell_num+="Chín trăm ";
                    break;
            }
            switch (tens){
                case 1:
                    spell_num+="mười ";
                    break;
                case 2:
                    spell_num+="hai mươi ";
                    break;
                case 3 :
                    spell_num+="ba mươi ";
                    break;
                case 4 :
                    spell_num+="bốn mươi ";
                    break;
                case 5 :
                    spell_num+="năm mươi ";
                    break;
                case 6 :
                    spell_num+="sáu mươi ";
                    break;
                case 7 :
                    spell_num+="bảy mươi ";
                    break;
                case 8 :
                    spell_num+="tám mươi ";
                    break;
                case 9 :
                    spell_num+="chín mươi ";
                    break;
            }
            switch (units){
                case 1:
                    spell_num+="mốt";
                    break;
                case 2:
                    spell_num+="hai";;
                    break;
                case 3 :
                    spell_num+="ba";
                    break;
                case 4 :
                    spell_num+="tư";
                    break;
                case 5 :
                    spell_num+="lăm";
                    break;
                case 6 :
                    spell_num+="sáu";
                    break;
                case 7 :
                    spell_num+="bảy";
                    break;
                case 8 :
                    spell_num+="tám";
                    break;
                case 9 :
                    spell_num+="chín";;
                    break;
                case 0:
                    spell_num+="";
            }
            System.out.println(spell_num);
        }
    }
}
