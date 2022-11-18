import java.util.Scanner;

public class ConditionalStatementsSignChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        String output = "";
        boolean negativeNumber = (a < 0 && b < 0 && c < 0) ||
                (a < 0 && b > 0 && c > 0) ||
                (a > 0 && b < 0 && c > 0) ||
                (a > 0 && b > 0 && c < 0);
        boolean zero = a == 0 || b == 0 || c == 0;

        if (negativeNumber) {
            output = "-";
        } else if (zero) {
            output = "0";
        } else {
            output = "+";
        }
        System.out.println(output);
    }
}
