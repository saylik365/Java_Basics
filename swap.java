public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("before swap: "+ a + ","+ b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap: "+ a+ ", "+ b);
    }
}
