public class implicitConversion {
    public static void main(String[] args) {
        int count = 22;
        // long countLong = 22L; 
        long countLong = count; //implicit datatype conversion

        System.out.println(((Object)count).getClass().getName());
        System.out.println(countLong);
        System.out.println(count);
    }
}

/*
 Implicit Conversion: 
 converting a datatype to another - can directly converted , automatically converted by compiler.
 In the above example, int count is implicitly converted into long. But if you try to print the type of count,
 it will return integer, as in implicit conversion, it does not change the variables type. 
 It only affects the assignment or the expression.
 Like, the value is converted to the new type but the original variable's type never changes.
 
 count is still int, countLong is still long, 
 java implicitly widened the value 22(int) to 22L(long) when copying it into countLong.
 java never changes a variable's declared type.
 SO, JAVA IS STATICALLY TYPED LANGUAGE so c++ too,  unlike javascript and python.
 */