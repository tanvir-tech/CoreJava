package String_practice;

public class String_test{
    public static void main(String[] args) {
        String s1 = "tanvir";                      // literal in scp
        String s2 = new String("I love java");  // in heap and scp


        char[] charTest = {'ক','\u0995','\u20AC','v','i','r'};   // char array is not actually string
        System.out.println(charTest);

        System.out.println("Char array length :"+charTest.length+"\n String length :"+s2.length());     // length vs length()

        System.out.println(s1 instanceof String);                // String test


    }
}
