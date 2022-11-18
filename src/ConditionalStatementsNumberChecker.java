import java.util.Scanner;

public class ConditionalStatementsNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        if(number % 1 == 0){
            System.out.println( number + " is Integer");
        }else
            System.out.println( number + " is Real number");
    }
}
