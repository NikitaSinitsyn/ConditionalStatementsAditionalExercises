import java.util.Scanner;

public class ConditionalStatementsSimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberSecond = Integer.parseInt(scanner.nextLine());
        char sym = scanner.nextLine().charAt(0);
        int result = 0;
        if(sym == '+'){
            result = numberOne + numberSecond;
        }else if(sym == '-'){
            result = numberOne - numberSecond;
        }else  if (sym == '*'){
            result = numberOne * numberSecond;
        }else if(sym == '/'){
            result = numberOne / numberSecond;
        }else  if(sym == '%'){
            result = numberOne % numberSecond;
        }else  if(sym == '^'){
            result = numberOne ^ numberSecond;
        }else
            System.out.println("Incorrect operation!");
        System.out.println(result);
    }
}
