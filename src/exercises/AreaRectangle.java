package exercises;
import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args) {
//... write program to calculate area of a rectangle and print answer to console

        Scanner input = new Scanner(System.in);

        System.out.println("What's the length of the rectangle?");
        Double length = input.nextDouble();

        System.out.println("What's the width of the rectangle?");
        Double width = input.nextDouble();

        Double area = length * width;
        System.out.println("The area of the rectangle is " + area);

        input.close();

    }
}
