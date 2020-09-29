package Type_Casting;

public class Premitives {
    static float f= 0.0f;           // by-default it is double......so use f after the value
    static double d = 0.0d;         // d for double is optional
    static long l;
    static int i;
    static short s;
    static byte b;
    static char c = '\u0995';       //char range is '\u0000' (or 0) to '\uffff'
    static boolean bool;

    public static void main(String[] args) {
        System.out.println("Float value : "+f);   //  +operator can convert float to string
        System.out.println("Double value : "+d);
        System.out.println("Long Int value : "+l);
        System.out.println("Interger value : "+i);
        System.out.println("Short Int value : "+s);
        System.out.println("Byte value : "+b);
        System.out.println("char value : "+c);
        System.out.println("Boolean value : "+bool);
    }
}
