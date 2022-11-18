import java.util.Scanner;

public class ConditionalStatementsQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        String output = "";
        double D = b * b - 4 * a * c;
        if(D > 0){
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            output = "Корни квадратного уравнения: " + x1 + "," +x2;
        }else if(D == 0){
            double x = -b / (2 * a);
            output = "Корень квадратного уравнения: " + x;
        }else
            output = "Квадратное уравнение не имеет корней";
        System.out.println(output);
    }
}
