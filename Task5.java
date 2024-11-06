import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        char startChar = 'D';
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus in ornare dui. Mauris eget lectus et sem tempus aliquet in eu ipsum. Donec ac odio dolor.";
        char reversedCase;
        reversedCase = Character.isLowerCase(startChar) ? Character.toUpperCase(startChar) : Character.toLowerCase(startChar);
        Pattern pattern = Pattern.compile("[" + startChar + reversedCase + "][a-zA-Z]*");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) System.out.println(matcher.group());
    }
}
