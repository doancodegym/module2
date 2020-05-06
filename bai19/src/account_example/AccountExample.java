package account_example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACC_EX = "^[a-z0-9_]{6,}$";
    private static Pattern pattern;
    private Matcher matcher;
    public AccountExample(){
        pattern = Pattern.compile(ACC_EX);
    }
    public boolean accountdate(String check){
        matcher = pattern.matcher(check);
        return matcher.matches();
    }
}
