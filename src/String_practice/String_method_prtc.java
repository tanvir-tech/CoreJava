package String_practice;

public class String_method_prtc {
    public static void main(String[] args) {
        String s1 = "tanvir";
        String s2 = new String("I love java");

        System.out.println(s2.lastIndexOf("java"));                  // lastIndexOf()
        System.out.println(s2.indexOf("java"));                         // firstIndexof()

        String[] strr = "hi this is test string".split(" ");          // split into String array obj. in heap
        for (String s : strr) {
            System.out.println(s);
        }







    }
}
