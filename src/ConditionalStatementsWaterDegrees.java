import java.util.Scanner;

public class ConditionalStatementsWaterDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        if(degrees == 0){
            System.out.println("Ice");
        }else if (degrees >= 1 && degrees <= 20) {
            System.out.println("Cold Water");
        }else  if (degrees >= 21 && degrees <= 30){
            System.out.println("Normal Temperature");
        }else if(degrees >= 31 && degrees <= 50){
            System.out.println("Hot Water");
        }else if(degrees >= 51 && degrees <= 99){
            System.out.println("Very Hot Water");
        }else if(degrees == 100) {
            System.out.println("Boiling Water");
        }
    }
}
