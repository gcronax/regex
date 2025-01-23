import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_7 {
    public static void main(String[] args) {
        Pattern pattern = Pattern
                .compile("[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}");
        Matcher matcher = pattern.matcher("5444-4444-4444-4444");

        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("encontrado");
        }

    }
}
