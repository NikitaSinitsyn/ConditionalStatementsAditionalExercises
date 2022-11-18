import java.util.Scanner;

public class ConditionalStatementsSymbolChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.nextLine().charAt(0);
        boolean toLowerCase = symbol >= 65 && symbol <= 90;
        boolean toUpperCase = symbol >= 97 && symbol <=122;
        boolean isDigit = symbol >= 48 && symbol <= 57;
        if(toLowerCase || toUpperCase ){
            System.out.println("Letter");
        }else if(isDigit){
            System.out.println("Digit");
        } else
            System.out.println("Other Symbol!");

    }
}
