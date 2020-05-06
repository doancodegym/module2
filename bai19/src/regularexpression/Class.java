package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class {
    private static final String CLASS_NAME = "[CAP]\\d{4}[GHIKLM]{1}$";
    private static Pattern pattern;
    private Matcher matcher;
    public Class(){
        pattern = Pattern.compile(CLASS_NAME);
    }
    public boolean validate(String check){
        matcher = pattern.matcher(check);
        return matcher.matches();
    }
}
