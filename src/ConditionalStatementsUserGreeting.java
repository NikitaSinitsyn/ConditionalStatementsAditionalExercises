import java.util.Locale;
import java.util.Scanner;

public class ConditionalStatementsUserGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String sex = scanner.nextLine().toLowerCase(Locale.ROOT);
        String sexAbbreviation = "Dear";

        if (sex.equals("male")) {
            sexAbbreviation = "Mr.";
        }else if (sex.equals("female")){
            sexAbbreviation = "Ms";
        }
        System.out.println("Hello " + sexAbbreviation + " " + name);

    }
}
