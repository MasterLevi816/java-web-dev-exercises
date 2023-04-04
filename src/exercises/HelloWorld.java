package exercises;
//.. add import statement for Scanner for user input
import java.util.Scanner;
public class HelloWorld {

    //... use main method for command line
    public static void main(String[] args) {

        //.. declare a scanner variable called input
        Scanner input = new Scanner(System.in);

        //... ask question to user
        System.out.println("Hello, what is your name: ");

        //...create a variable called name to store user response using scanner method
        String name = input.nextLine();

        //... use concatenation to print greeting
        System.out.println("hello " + name);

        //.. close the scanner
        input.close();

    }
}
