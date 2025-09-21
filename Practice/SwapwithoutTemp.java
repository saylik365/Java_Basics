//Swap two numbers (without using temp → arithmetic method).

import java.util.Scanner;
public class SwapwithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b= sc.nextInt();

        //suppose, a = 10, b=20
        a = a + b; // a = 10 + 20 = 30 , a=30 and b=20
        b = a -b;  //b = 30 - 20 = 10 , a =30 and b = 10
        a = a - b;  // a = 30-10, a=20 and b =10

        System.out.println("after swap: "+ a+","+b);
    }
}
