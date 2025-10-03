//sum of n even numbers
import java.util.Scanner;
public class loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n= sc.nextInt();
        int sum =0;
        for(int i=1; i<=n;i++){
            // sum = sum+ 2*i;
            sum += 2*i;
        }
        System.out.println("The sum of Even numbers is: "+ sum);
    }
}
