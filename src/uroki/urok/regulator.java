package uroki.urok;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regulator {
    public static void main(String[] args) {
        String text = "aba aba a!a abba adca abea";
        Pattern pattern = Pattern.compile("(ab)+");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.replaceFirst("(ab)+"));
    }
}
