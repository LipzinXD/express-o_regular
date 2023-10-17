import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClasseExpresseRegular {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("[A-Z]{3}");
        Matcher n = p.matcher("123ABC456");
        while (n.find()) {
            System.out.println(n.group());
        }
    }
}