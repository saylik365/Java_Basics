//Take user’s age as String, convert it to int, and add 5.
public class typecasting3 {
    public static void main(String[] args) {
        String age = "20";
        int intage = Integer.parseInt(age);

        System.out.println(age);
        System.out.println(intage);

        int newage = intage + 5;
        System.out.println(" after 5 years: "+ newage);
    }
}
