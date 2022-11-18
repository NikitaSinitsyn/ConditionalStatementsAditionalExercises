import java.util.Scanner;

public class ConditionalStatementsSquareNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double sqrt = Math.sqrt(number);
        if(sqrt %  1 == 0) {
            System.out.println("Square number");
        }else
            System.out.println("Not square number");
    }
}
