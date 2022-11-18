import java.util.Locale;
import java.util.Scanner;

public class ConditionalStatementsProductPriceCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine().toLowerCase(Locale.ROOT);
        String product = scanner.nextLine().toLowerCase(Locale.ROOT);
        String output = " ";
        boolean coffeeSofia = product.equals("coffee") && city.equals("sofia");
        boolean coffeePlovdiv = product.equals("coffee") && city.equals("plovdiv");
        boolean coffeVarna = product.equals("coffee") && city.equals("varna");
        boolean coffeBurgas = product.equals("coffee") && city.equals("burgas");
        boolean miniralWaterSofia = product.equals("mineral water") && city.equals("sofia");
        boolean miniralWaterPlovdiv = product.equals("mineral water") && city.equals("plovdiv");
        boolean miniralWaterVarna = product.equals("mineral water") && city.equals("varna");
        boolean miniralWaterBurgas = product.equals("mineral water") && city.equals("burgas");
        boolean hotChocolateSofia = product.equals("hot chocolate") && city.equals("sofia");
        boolean hotChocolatePlovdiv = product.equals("hot chocolate") && city.equals("plovdiv");
        boolean hotChocolateVarna = product.equals("hot chocolate") && city.equals("varna");
        boolean hotChocolateBurgas = product.equals("hot chocolate") && city.equals("burgas");
        boolean beerSofia = product.equals("beer") && city.equals("sofia");
        boolean beerPlovdiv = product.equals("beer") && city.equals("plovdiv");
        boolean beerVarna = product.equals("beer") && city.equals("varna");
        boolean beerBurgas = product.equals("beer") && city.equals("burgas");
        boolean energyDrinkSofia = product.equals("energy drink") && city.equals("sofia");
        boolean energyDrinkPlovdiv = product.equals("energy drink") && city.equals("plovdiv");
        boolean energyDrinkVarna = product.equals("energy drink") && city.equals("varna");
        boolean energyDrinkBurgas = product.equals("energy drink") && city.equals("burgas");
        boolean cocaColaSofia = product.equals("coca-cola") && city.equals("sofia");
        boolean cocaColaPlovdiv = product.equals("coca-cola") && city.equals("plovdiv");
        boolean cocaColaVarna = product.equals("coca-cola") && city.equals("varna");
        boolean cocaColaBurgas = product.equals("coca-cola") && city.equals("burgas");
        if (coffeeSofia) {
            output = "0.85";
        } else if (coffeePlovdiv) {
            output = "0.70";
        } else if (coffeVarna) {
            output = "0.60";
        } else if (coffeBurgas) {
            output = "0.40";
        } else if (miniralWaterSofia) {
            output = "1.10";
        } else if (miniralWaterPlovdiv) {
            output = "1.00";
        } else if (miniralWaterVarna) {
            output = "0.80";
        } else if (miniralWaterBurgas) {
            output = "1.00";
        } else if (hotChocolateSofia) {
            output = "1.20";
        } else if (hotChocolatePlovdiv) {
            output = "1.00";
        } else if (hotChocolateVarna) {
            output = "1.40";
        } else if (hotChocolateBurgas) {
            output = "0.70";
        } else if (beerSofia) {
            output = "1.60";
        } else if (beerPlovdiv) {
            output = "1.50";
        } else if (beerVarna) {
            output = "1.10";
        } else if (beerBurgas) {
            output = "1.25";
        } else if (energyDrinkSofia) {
            output = "2.40";
        } else if (energyDrinkPlovdiv) {
            output = "1.90";
        } else if (energyDrinkVarna) {
            output = "2.50";
        } else if (energyDrinkBurgas) {
            output = "3.00";
        } else if (cocaColaSofia) {
            output = "2.20";
        } else if (cocaColaPlovdiv) {
            output = "1.90";
        } else if (cocaColaVarna) {
            output = "1.80";
        } else if (cocaColaBurgas) {
            output = "1.70";
        }
        System.out.println(output);
    }
}
