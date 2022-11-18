import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        if ( num % 2 == 0 )
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
