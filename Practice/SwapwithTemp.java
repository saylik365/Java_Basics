//Swap two numbers (using a temp variable).

import java.util.Scanner;
public class SwapwithTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter Second number");
        int b = sc.nextInt();
        int temp;

       temp = a;
       a = b;
       b = temp;

        System.out.println("After swap: "+ a+ ","+  b );

    }
}
