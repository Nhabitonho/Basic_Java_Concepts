package java_tutorial;

public class DataTypes {
    public static void main(String[] args) {
        // Syntax => type variable = value;
        byte b = -128;
        short sh = -32768;
        char c = 'x';
        int i = 0;
        long l = 100L;
        float f = 1.32f;
        double d = 2.5d;
        boolean bl = true;
        String st = "this is a String";


        System.out.println("Variable and Data Type");
        System.out.println("this is byte type " + b);
        System.out.println("this is short type " + sh);
        System.out.println("this is char type " + c);
        System.out.println("this is int type " + i);
        System.out.println("this is long type " + l);
        System.out.println("this is float type " + f);
        System.out.println("this is double type " + d);
        System.out.println("this is boolean type " + bl);
        System.out.println("this is String type " + st);

        //Widen casting
        System.out.println("Casting ");
        int i1 = c;
         System.out.println("i1" + i1);
         //Narrowing Casting
        int i2 = (int) d;
        System.out.println(i2);

        //Operator
        int num1 = 10;
        int num2 = 5;
        System.out.println("Operator");
        System.out.println(num1++);
        System.out.println(num1--);
        System.out.println(10*5);



    }
}
