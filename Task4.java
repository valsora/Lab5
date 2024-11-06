import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String ip = "74.255.0.139";
        Pattern pattern = Pattern.compile("(25[0-5]|2[0-4][0-9]|1\\d{2}|[1-9][0-9]|[0-9])(\\.(25[0-5]|2[0-4][0-9]|1\\d{2}|[1-9][0-9]|[0-9])){3}");
        Matcher matcher = pattern.matcher(ip);
        if (matcher.matches()) System.out.println("IP is valid");
    }
}
