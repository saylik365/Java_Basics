//Q2: Print even numbers from 1 to 100.
public class Loop2 {
    public static void main(String[] args) {
        for(int i=1; i<=100;i++){
            if(i%2!=0){ //odd and for even i%2==0
                System.out.println("Odd numbers are: "+i);
            }
        }
    }
}
