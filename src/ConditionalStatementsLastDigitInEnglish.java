import java.util.Scanner;

public class ConditionalStatementsLastDigitInEnglish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int lastDigit = number % 10;
        String lastDigitAsWord = "";
        switch (lastDigit){
            case 0:
                lastDigitAsWord = "Zero";
                break;
            case 1:
                lastDigitAsWord = "One";
                break;
            case 2:
                lastDigitAsWord = "Two";
                break;
            case 3:
                lastDigitAsWord = "Three";
                break;
            case 4:
                lastDigitAsWord = "Four";
                break;
            case 5:
                lastDigitAsWord = " Five";
                break;
            case 6:
                lastDigitAsWord = "Six";
                break;
            case 7:
                lastDigitAsWord = "Seven";
                break;
            case 8:
                lastDigitAsWord = "Eight";
                break;
            case 9:
                lastDigitAsWord = "Nine";
                break;
        }
        System.out.println(lastDigitAsWord);
    }
}
