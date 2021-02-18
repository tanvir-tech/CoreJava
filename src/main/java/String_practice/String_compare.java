package String_practice;
//3ways to string_Compare
//equals() , equalsIgnorecase()
// ==
// compareTo()
public class String_compare {
    public static void main(String[] args) {
        String s1 = "Hello Java";       // in SCP
        String s2 = "Hello";            // in SCP
        String s3 = " Java";            // in SCP

        String s4 = "Hello"+" "+"Java";                      // already existing in SCP
        String s5 = s2+s3;                  // new in HEAP
        String s6 = s2.concat(s3);          // new in HEAP

        System.out.println(s4==s1);                         // true .........checks SCP object

        System.out.println(s5.equals(s1));                  // true .........checks characters
        System.out.println(s5.equalsIgnoreCase(s1));        // true .........checks characters ignoring case

        System.out.println(s6.compareTo(s1));               // 0    .........subtracting each characters int value

    }
}
