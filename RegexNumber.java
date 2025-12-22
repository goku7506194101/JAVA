import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNumber {
    public static void main (String[] args) {
        String text = "The prices 50, 99.99, and 1000 along with 45.5 and 200.";
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Numbers found in the string: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
