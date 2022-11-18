import java.util.Locale;
import java.util.Scanner;

public class ConditionalStatementsDaysOfTheMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine().toLowerCase(Locale.ROOT);
        String output = " ";
        if(month.equals("january")){
            output = "31 days";
        }else  if(month.equals("february")){
            output = "28 days";
        }else  if(month.equals("march")) {
            output = "31 days";
        }else  if(month.equals("april")) {
            output = "30 days";
        }else  if(month.equals("may")) {
            output = "31 days";
        }else  if(month.equals("june")) {
            output = "30 days";
        }else  if(month.equals("july")) {
            output = "31 days";
        }else  if(month.equals("august")) {
            output = "30 days";
        }else  if(month.equals("september")) {
            output = "31 days";
        }else  if(month.equals("october")) {
            output = "30 days";
        }else  if(month.equals("november")) {
            output = "31 days";
        }else  if(month.equals("december")) {
            output = "30 days";
        }else
            output = "Invalid month!";
        System.out.println(output);
    }
}
