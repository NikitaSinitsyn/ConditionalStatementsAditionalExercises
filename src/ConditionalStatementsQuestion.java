import java.util.Locale;
import java.util.Scanner;

public class ConditionalStatementsQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" What is the right way to create a variable in Java?");
        System.out.println("A: int someRandomVariable = 5");
        System.out.println("B: char symbol = \"$\"");
        System.out.println("C: float pi = 3.14");
        System.out.println("int 1number = 5");
        char answer = scanner.nextLine().toUpperCase(Locale.ROOT).charAt(0);
        if(answer == 'A' || answer == 'B' || answer == 'C' || answer == 'D'){
            System.out.println("Your answer is " + answer);
        }else
            System.out.println("Invalid answer!");
    }
}
