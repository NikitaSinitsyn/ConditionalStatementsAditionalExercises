import java.util.Scanner;

public class ConditionalStatementsBeersPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String zateckyHus = "Zatecky Hus - 1.69lv.";
        String budweiser = "Budweiser - 2.59lv.";
        String zagorka = "Zagorka - 1.49lv.";
        String pirinsko = "Pirinsko - 2.19lv.";
        String staropramen = "Staropramen - 2.11lv.";
        String hobgoblin = "Hobgoblin - 4.59lv.";
        String output = "";


        if(budget >= 0 && budget <= 5){
            if(budget == 1){
                output = "You can't buy beer!";
            }else if(budget == 2){
                output = "You can buy - " + zateckyHus + " or\n " + zagorka;
            }else if (budget == 3){
                output = "You can buy - " + zateckyHus + " or\n " + zagorka + " or\n " + budweiser + " or\n " + pirinsko + " or\n " + staropramen + " or\n two " + zagorka;
            }else if(budget == 4){
                output = "You can buy - " + zateckyHus + " and " + zagorka + " or\n " + zateckyHus + " and " + pirinsko + " or\n " + zateckyHus + " and " + staropramen + " or\n" + budweiser +" or\n " +
                        zagorka + " and " + staropramen + " or\n " + zagorka + " and " + pirinsko + " or\n " + "two " + zateckyHus + " or\n " + "two " + zagorka;
            }else
                output = "You can buy - " + hobgoblin + " or\n " + zateckyHus + " and " + budweiser + " or\n " + "two " + zateckyHus + " and " + zagorka + " or\n " + zateckyHus + " and " +
                        pirinsko + " or\n" + zateckyHus + " and " + staropramen + " or\n " + budweiser + " and " + zagorka + " or\n " + budweiser + " and " + pirinsko + " or\n " + budweiser + " and " + staropramen +
                        " or\n " + "three " + zagorka + " or\n " + "two " + zagorka + " and " + zateckyHus + " or\n " + zagorka + " and " + pirinsko + " or\n " + zagorka + " and " + staropramen + " or\n " +
                        "two " + pirinsko + " or\n " + pirinsko + " and " + staropramen + " or\n " + "two " + staropramen;
        }else
            output = "Invalid budget!";
        System.out.println(output);
    }
}
