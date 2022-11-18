import java.util.Scanner;

public class ConditionalStatementsGreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        String output = " ";
        if(a > b && a > c){
            output  = "A is the biggest number";
        }else  if (b > a && b > c) {
            output = "B is the biggest number";
        }else
            output = "C is the biggest number";
        System.out.println(output);
    }
}
