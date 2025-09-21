// package Conditional Operators;

//find largest number in three numbers
import java.util.Scanner;
public class nestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // int max = 0;

        System.out.println(" The Larger is: "+(a>b ? a>c ? "a" : "c" : b > c ? "b" : "c"));
        

        // if(a > b){
        //     System.out.println("a is larger than b");

        //     if(a>c){
        //         System.out.println("a is larger than c");
        //         System.out.println("a is largest");
        //     }else{
        //         System.out.println("c is larger than a");
        //         System.out.println("C is largest" + c);
        //     }
        // }else{
        //     System.out.println("b is larger than a");
        //     if(b>c){
        //         System.out.println("b is larger than c");
        //         System.out.println(" b is largest"+ b);
        //     }else{
        //         System.out.println("c is largest" + c); 
        //     }
        // }


    }
}
