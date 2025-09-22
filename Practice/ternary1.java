import java.util.Scanner;
public class ternary1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        int a = sc.nextInt();
        String num = (a > 0) ? "Positive" : ((a < 0)) ? "Negative" : "Zero";

        System.out.println(num);

        String result = (a %2 ==0)? "Even" : "odd";
        System.out.println(result);

    }
}
