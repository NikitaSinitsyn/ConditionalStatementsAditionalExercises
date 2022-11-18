import java.util.Scanner;

public class ConditionalStatementsTicketsPrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        int ticketPrice = 50;
        String output = "";
        double finalCoast = 0;
        if (age > 0 && age < 100) {
            if (age < 16) {
                finalCoast = ticketPrice * 0.5;
                output = String.valueOf(finalCoast);
            } else if (age >= 16 && age <= 24) {
                finalCoast = ticketPrice - (ticketPrice * 0.35);
                output = String.valueOf(finalCoast);
            } else if (age >= 25 && age <= 65) {
                finalCoast = ticketPrice;
                output = String.valueOf(finalCoast);
            } else
                finalCoast = ticketPrice * 0.5;
            output = String.valueOf(finalCoast);
            System.out.println("The final cost of the ticket is - "+ finalCoast + " lv!");
        } else
            System.out.println("Invalid age!");
    }
}
