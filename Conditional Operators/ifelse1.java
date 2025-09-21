// package Conditional Operators;
import java.util.Scanner;
public class ifelse1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter which day is it: ");
        int day1 = sc.nextInt();

         if(day1 == 1){
            System.out.println("You can go Home");
         }else{
            System.out.println("You have to go to the office");
         }

         sc.close();
    }
}
