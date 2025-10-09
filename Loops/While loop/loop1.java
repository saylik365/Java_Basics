//in while loops, you don't know how many times a loop is going to continue (no. of iterations) but you know the condition.
//for ex: you don't know how many days you have to go to the school but you know you have to go until semester ends.

import java.util.Scanner;
public class loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hasLearnt = false;
        //DEFAULT VALUE OF BOOLEAN IS FALSE

        while (!hasLearnt) {
            System.out.println("Went to school, tried to learn");
            System.out.println("have you Learnt??");
            hasLearnt = sc.nextBoolean();

        }
    }
}

//in the above exmple, i knew i was going to learn and has to go school but i did not knew when will i learn the concept exactly. 
