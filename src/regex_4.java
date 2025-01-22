import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern
                .compile("^[-0-9]+[.][0-9]{4}$");
        Matcher matcher = pattern.matcher("312.4549");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("encontrado");
        }
    }
}
