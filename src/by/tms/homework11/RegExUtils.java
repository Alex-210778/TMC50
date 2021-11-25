package by.tms.homework11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class RegExUtils {

    private RegExUtils() {
        throw new UnsupportedOperationException();
    }

    public static boolean isValidEmailAddress(String email) {
        String emailPattern = "[a-zA-z]\\w*@{1}[a-zA-z]\\w*\\.{1}[com|org]+";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void findHexNumbers(String str){
        String hexPattern = "0[xX]{1}[\\dA-F]+";
        Pattern pattern = Pattern.compile(hexPattern);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
