import java.util.Scanner;

public class ConditionalStatementsLetterChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.nextLine().charAt(0);
        boolean latinLetter = (symbol >= 65 && symbol <= 90) || (symbol >= 97 && symbol <= 122);
        boolean vowel = symbol == 65 || symbol == 69 || symbol == 73 || symbol == 79 || symbol == 85 || symbol == 89 || symbol == 97 || symbol == 101 || symbol == 105 || symbol == 111 ||
                symbol == 117 || symbol == 121;
        if (latinLetter) {
            if (vowel) {
                System.out.println("The symbol is vowel!");
            } else {
                System.out.println("The symbol is consonant!");
            }
        } else
            System.out.println("Invalid Input!");
    }
}
