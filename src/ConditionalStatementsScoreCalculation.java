import java.util.Scanner;

public class ConditionalStatementsScoreCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPoints = Integer.parseInt(scanner.nextLine());
        String output = "";
        double result = 0;
        if (numberOfPoints >= 0 && numberOfPoints <= 1000) {
            if (numberOfPoints >= 0 && numberOfPoints < 10) {
                result = numberOfPoints;
                output = "Your number of points is " + result;
            } else if (numberOfPoints >= 10 && numberOfPoints <= 100) {
                result = numberOfPoints + (numberOfPoints * 0.1);
                output = "Your number of points is " + result;
            } else if (numberOfPoints >= 101 && numberOfPoints <= 200) {
                result = numberOfPoints + (numberOfPoints * 0.25);
                output = "Your number of points is " + result;
            } else if (numberOfPoints >= 201 && numberOfPoints <= 300) {
                result = numberOfPoints * 2;
                output = "Your number of points is " + result;
            } else if (numberOfPoints >= 301 && numberOfPoints <= 400) {
                result = numberOfPoints * 3;
                output = "Your number of points is " + result;
            } else if (numberOfPoints >= 401 && numberOfPoints <= 600) {
                result = numberOfPoints * 4.5;
                output = "Your number of points is " + result;
            } else
                result = numberOfPoints * 6;
            output = "Your number of points is " + result;

        } else
            output = "Invalid number of points!";
        if (result % 2 == 0) {
            output = "Your number of points is " + result;
        } else if (result == 0) {
            result = 0;
            output = "Your number of points is " + result;
        } else
            result = result + 5;
        output = "Your number of points is " + result;
        System.out.println(output);
    }
}
