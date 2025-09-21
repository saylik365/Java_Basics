package variables;
// package Practice;
// public class largest {
//     public static void main(String[] args) {
//         int a = 30;
//         int b = 50;

//         // if(a>b) System.out.println("A is Larger");
//         if(a>b){
//             System.out.println("a is largest");
//         }else{
//             System.out.println("b is larger than a");
//         }
//     }
// }

import java.util.Scanner;

public class largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for a: ");
        int a = sc.nextInt();

        System.out.println("Enter number for b: ");
        int b = sc.nextInt();

        // if(a>b){
        //     System.out.println(" a is larger than b");
        // }else{
        //     System.out.println("b is larger than a");
        // }
    
        //using ternery operator which is a shorthand for if-else statement.
        System.out.println(" so the larger is: "+ ((a > b) ? "a" : "b"));

    }
}


