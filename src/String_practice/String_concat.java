package String_practice;
// ........................2way concatenation
// +............................................................ SCP , HEAP
// concat()..................................................... HEAP
public class String_concat {
    public static void main(String[] args) {

        String s1 = "Hello Java";       // in SCP
        String s2 = "Hello";            // in SCP
        String s3 = " Java";            // in SCP

        String s4 = "Hello"+" "+"Java";                      // already existing in SCP
        String s5 = s2+s3;                  // new in HEAP
        String s6 = s2.concat(s3);          // new in HEAP

        System.out.println(s4==s1);         // true
        System.out.println(s5==s1);         // false
        System.out.println(s6==s1);         // false

    }
}
