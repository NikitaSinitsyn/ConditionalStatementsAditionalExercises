import java.util.Scanner;

public class ConditionalStatementsTriangleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideA = Integer.parseInt(scanner.nextLine());
        int sideB = Integer.parseInt(scanner.nextLine());
        int sideC = Integer.parseInt(scanner.nextLine());
        boolean equilateralTriangle = sideA == sideB && sideA == sideC;
        boolean isoscelesTriangle = (sideA == sideB && sideA != sideC ) || (sideA == sideC && sideA != sideB) || (sideB == sideC && sideB != sideA);


        String output = "";
        if (equilateralTriangle){
            output = "Уquilateral triangle";
        }else if(isoscelesTriangle){
            output = "Isosceles triangle";
        }else
            output = "Scalene triangle";
        System.out.println(output);
    }
}
