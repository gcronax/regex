import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_5 {
    public static void main(String[] args) {
        Pattern pattern = Pattern
                .compile("[0-9A-F]");
        Matcher matcher = pattern.matcher("2u2");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("encontrado");
        }

    }
}
