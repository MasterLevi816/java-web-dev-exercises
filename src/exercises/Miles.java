package exercises;
import java.util.Scanner;
public class Miles {
    public static void main (String[] args){
        //... ask user number of miles driven and amount gas used to print miles per gallon

        Scanner input = new Scanner(System.in);

        System.out.println("How many miles: ");
        Double miles = input.nextDouble();

        System.out.println("How much gas:");
        Double gas = input.nextDouble();

        Double mpg = miles / gas;

        System.out.println("Your miles per gallon is " + mpg );

        input.close();
    }
}
