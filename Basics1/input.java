import java.util.Scanner;


public class input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int FirstNum = sc.nextInt();

        System.out.println("Enter Second Number");
        long SecondNum = sc.nextLong();

        int result = FirstNum + (int)SecondNum; //typecasting or explicit type conversion
        System.out.println(" The Result is: " + result);

        sc.close();
    }
}