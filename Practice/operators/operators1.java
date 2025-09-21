package operators;
//Given three numbers, find the largest using && (logical AND).

import java.util.Scanner;
public class operators1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc. nextInt();

        // if(a>=b && a >=c){
        //     System.out.println("a is largest");
        // }else if(b>=c){
        //     System.out.println("b is largest");
        // }else{
        //     System.out.println("c is largest");
        // }
   
        int largest = (a>=b && a>=c)? a : (b>=c)? b:c;
        System.out.println("largest is "+ largest);
    }

}
