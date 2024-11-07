import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String text = "The price of the product №3 is 19.99$. The temperature outside is -1°C. 6 - 2 = 4.";
        Pattern pattern = Pattern.compile("(-)?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) System.out.println(matcher.group());
    }
}
