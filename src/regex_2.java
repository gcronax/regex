import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern
                .compile("[a-z]{6,9}[0-9]{0,3}@alu.gva.es");
        Matcher matcher = pattern.matcher("guicamher@alu.edu.gva.es");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("encontrado");
        }
    }
}
