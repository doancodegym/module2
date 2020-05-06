package regularexpression;

public class RegularExampleTest {
    private static String[] check = new String[]{"C0220M","P291K"};
    private static String[] check2 = new String[]{"(84)-(0352027397)","84-0293582239"};
    public static void main(String[] args) {
        Class clazz = new Class();
        NumberPhone numberPhone = new NumberPhone();
        for (String rehular:check) {
            boolean isValid = clazz.validate(rehular);
            System.out.println("Class : " + rehular + " isValid : " + isValid);
        }for (String rehular:check2) {
            boolean isValid = numberPhone.validate(rehular);
            System.out.println("Class : " + rehular + " isValid : " + isValid);
        }
    }
}
