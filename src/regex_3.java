import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_3 {
    public static void main(String[] args) {
        Pattern pattern = Pattern
                .compile("^@[a-zA-Z0-9_-]+");
        Matcher matcher = pattern.matcher("@xprueba2312");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("encontrado");
        }
    }
}
