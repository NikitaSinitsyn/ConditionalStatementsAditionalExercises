import java.util.Scanner;

public class ConditionalStatementsDayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String output = "";
        if (number == 1) {
            output = "Monday";
        } else if (number == 2) {
            output = "Tuesday";
        } else if (number == 3) {
            output = "Wednesday";
        } else if (number == 4) {
            output = "Thursday";
        } else if (number == 5) {
            output = "Friday";
        } else if (number == 6) {
            output = "Saturday";
        } else if (number == 7) {
            output = "Sunday";
        }else
            output = "Invalid Number";
        System.out.println(output);
    }
}
