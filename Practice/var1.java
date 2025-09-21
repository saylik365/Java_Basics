//Declare variables for your name, age, and CGPA. Print them in a single line.

import java.util.Scanner;
public class var1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char name  = sc.next().charAt(0); //returns first letter of word
        System.out.println("Enter fields: ");
        String name  = sc. next(); //returns whole word : hello

        // String name1 = sc.nextLine(); // takes whole line like hello world.

        int age = sc.nextInt();
        float cgpa = sc.nextFloat();

        System.out.println("I am " + name + " and i am " + age + " years old. This year I achieved " + cgpa + " CGPA.");
    }
}
