import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println(" the number is even");
        }else{
            System.out.println("the number is odd");
        }

    }
}
