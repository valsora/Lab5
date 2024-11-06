import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String password = "passworD0";
        Pattern pattern = Pattern.compile("(?=.*[A-Z].*)(?=.*\\d.*)^[a-zA-Z0-9]{8,16}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) System.out.println("Password is valid");
    }
}
