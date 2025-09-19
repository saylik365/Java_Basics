public class explicitConversion {
    public static void main(String[] args) {
        long Longcount = 23;
        int intCount = (int)Longcount; 
        System.out.println(intCount);

        int age= 150;
        byte newAge = (byte) age;
        System.out.println(newAge); //will print something else, will rotate cause byte has only limit size of 127.
    }
}
