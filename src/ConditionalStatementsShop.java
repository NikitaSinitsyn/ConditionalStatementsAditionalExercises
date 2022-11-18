import java.util.Scanner;

public class ConditionalStatementsShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        int firstPrice = Integer.parseInt(scanner.nextLine());
        int secondPrice = Integer.parseInt(scanner.nextLine());
        int thirdPrice = Integer.parseInt(scanner.nextLine());
        int symPrice = Math.abs(firstPrice) + Math.abs(secondPrice) + Math.abs(thirdPrice);
        int insufficientAmount = budget - symPrice;
        if(symPrice > budget){
            System.out.println("Unfortunately, you do not have enough money. You need " + insufficientAmount + " $ more!");
        }else
            System.out.println("You have enough money to buy these products! Money left - " + insufficientAmount + "$!");
    }
}
