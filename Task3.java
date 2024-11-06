import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String text = "loreM ipsUm loreM";
        Pattern pattern = Pattern.compile("[a-z][A-Z]");
        Matcher matcher = pattern.matcher(text);
        HashSet<String> hashSet = new HashSet<>();
        while (matcher.find()) hashSet.add(matcher.group());
        for (String regex : hashSet) {
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(text);
            text = matcher.replaceAll("!" + regex + "!");
        }
        System.out.println(text);
    }
}
