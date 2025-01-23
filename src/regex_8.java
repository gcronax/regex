import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_8 {
    public static void main(String[] args) {
        Pattern pattern = Pattern
                .compile("^(\\+34)[0-9]{9}$");
        Matcher matcher = pattern.matcher("+34123456678");

        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("encontrado");
        }

    }
}
