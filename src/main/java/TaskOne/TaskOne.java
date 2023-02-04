package TaskOne;

import java.util.regex.Pattern;

public class TaskOne {

    public static void main(String[] args) {

        email("girbov@gmail.com");
        email("girbov");
    }

    public static void email(String email) {
        String regex = "[a-zA-Z]\\w*@\\w{3,}\\.(org|com)";
        System.out.println(Pattern.matches(regex, email));
    }
}
