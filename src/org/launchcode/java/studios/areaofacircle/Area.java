package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
     double radius;
     double area;

     Scanner input = new Scanner (System.in);
     System.out.print("Enter the radius: ");
     radius = input.nextDouble();
     input.close();

    //... area = 3.14 * radius * radius;
       area = Circle.getArea(radius);

     System.out.print("The area of a circle of radius " + radius + " is " + area);

    }
}
