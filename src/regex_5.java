import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_5 {
    public static void main(String[] args) {
        Pattern pattern = Pattern
                .compile("\\b[0-9a-fA-F]+\\b");
        Matcher matcher = pattern.matcher("2F");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("encontrado");
        }

    }
}
