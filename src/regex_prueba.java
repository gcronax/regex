import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_prueba {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("casa");
        Matcher matcher = pattern.matcher("la casa de la playa");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("encontrado");
        } else {
            System.out.println("no encontrado");
        }
    }
}
