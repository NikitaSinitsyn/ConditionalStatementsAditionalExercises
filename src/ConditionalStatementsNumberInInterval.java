import java.util.Scanner;

public class ConditionalStatementsNumberInInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        boolean inInterval = x > n && x <= m;
        String output = "";
        if(n < m){
            if(inInterval){
                output = "x is in interval";
            }else
                output = "x is not in interval";
        }else
            output = "The conditional is incorrect! n is lager than m!";
        System.out.println(output);

    }
}
