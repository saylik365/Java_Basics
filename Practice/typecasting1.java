//Q11: Assign an int value to a double and print result (implicit casting).
//Q12: Assign a double value to an int (explicit casting), print both.
public class typecasting1 {
    public static void main(String[] args) {
        int marks = 80;
        double dmarks = marks;//implicit

        System.out.println("Marks:" +marks);
        System.out.println("double marks: "+ dmarks);

        double percentage = 95.67;
        int intPercentage = (int)percentage;

        System.out.println("double percentage: "+ percentage);
        System.out.println("int percentage: "+ intPercentage);
    }
}
