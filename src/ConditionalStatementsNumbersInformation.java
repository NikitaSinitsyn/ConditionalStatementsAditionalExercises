import java.util.Scanner;

public class ConditionalStatementsNumbersInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int sum = firstNumber + secondNumber + thirdNumber;
        int product = firstNumber * secondNumber * thirdNumber;
        String outputMax = "";
        String outputMin = "";
        if (firstNumber > secondNumber && firstNumber > thirdNumber && secondNumber > thirdNumber) {
            outputMax = "First Number";
            outputMin = "Third Number";
        } else if (firstNumber > secondNumber && firstNumber > thirdNumber && thirdNumber > secondNumber) {
            outputMax = "First Number";
            outputMin = "Second Number";
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber && firstNumber > thirdNumber) {
            outputMax = "Second Number";
            outputMin = "Third Number";
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber && thirdNumber > firstNumber) {
            outputMax = "Third Number";
            outputMin = "First Number";
        } else if (thirdNumber > secondNumber && thirdNumber > firstNumber && firstNumber > secondNumber) {
            outputMax = "Third Number";
            outputMin = "Second number";
        } else if (thirdNumber > secondNumber && thirdNumber > firstNumber && secondNumber > firstNumber) {
            outputMax = "Third Number";
            outputMin = "First Number";
        }
        System.out.println("The max number is " + outputMax);
        System.out.println("The min number is " + outputMin);
        System.out.println("The sum of numbers is " + sum);
        System.out.println("The product of numbers is " + product);
    }
}
