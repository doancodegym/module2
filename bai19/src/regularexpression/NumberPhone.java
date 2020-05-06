package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static final String NUMBER = "[(]\\d{2}[)][-][(]\\d{10}[)]";
    private static Pattern pattern;
    private Matcher matcher;
    public NumberPhone(){
        pattern = Pattern.compile(NUMBER);
    }
    public boolean validate(String check){
        matcher = pattern.matcher(check);
        return matcher.matches();
    }
}
