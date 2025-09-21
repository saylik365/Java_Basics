//Find area and perimeter of a rectangle (length, breadth as variables).

import java.util.Scanner;
public class areaofRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of rectangle: ");
        double length = sc.nextDouble();

        System.out.println("Enter Width of Rectangle:");
        double width = sc.nextDouble();

        double area, perimeter;
        area = length * width;
        System.out.println("Area of rectangle is: " + area);

        // perimeter = 2 *(area);
        perimeter = 2 *(length * width);
        System.out.println("Perimeter of rectangle is: "+ perimeter);
    }
}
