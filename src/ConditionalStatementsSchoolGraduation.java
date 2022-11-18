import java.util.Scanner;

public class ConditionalStatementsSchoolGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float grade = Float.parseFloat(scanner.nextLine());
        if (grade >= 2 && grade <= 6) {
            if (grade >= 2 && grade < 3)
                System.out.println("Слаб");
            if (grade >= 3 && grade < 3.5)
                System.out.println("Среден");
            if (grade >= 3.5 && grade < 4.5)
                System.out.println("Добър");
            if (grade >= 4.5 & grade < 5.5)
                System.out.println("Много добър");
            if(grade >= 5.5 && grade <= 6)
                System.out.println("Отличен!");

        } else
            System.out.println("Invalid grade!");

    }
}
