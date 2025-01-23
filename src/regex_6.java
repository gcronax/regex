import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_6 {
    public static void main(String[] args) {
        Pattern pattern = Pattern
                .compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
        Matcher matcher = pattern.matcher("21/03/2019");

        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("encontrado");
        }

    }
}
