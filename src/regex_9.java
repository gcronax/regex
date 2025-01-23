import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_9 {
    public static void main(String[] args) {
        Pattern pattern = Pattern
                .compile("^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$");
        Matcher matcher = pattern.matcher("192.168.1.1");

        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("encontrado");
        }

    }
}
