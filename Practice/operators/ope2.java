package operators;
//Demonstrate increment (++) and decrement (--) by printing before/after values.
import java.util.Scanner;
public class ope2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("before increment "+a);
        a++;
        System.out.println("After increment " + a);        

        System.out.println("before decrement "+b);
        b--;
        System.out.println("After decrement " + b);
    }
}
