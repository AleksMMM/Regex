import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRunner {

    public static void main(String[] args) {
        System.out.println(matcher("123"));
    }

    // сравниваю строку на соответствие регулярному выражению
    public static boolean matcher(String str) {
        Pattern pattern = Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
