//Print sum of first N natural numbers.
import java.util.Scanner;
public class Loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int  i= 1; i<=num;i++){
            sum = sum+i;
        }
        System.out.println("Sum of N Natural Numbers is: "+ sum);

        //Print multiplication table of a number.
        for(int i =1; i<=10; i++){
            System.out.println("The table is: "+ i* num);
        }
    }
}
