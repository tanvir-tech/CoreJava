package String_practice;

public class String_Buffer {
    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer();
        StringBuffer sbf2 = new StringBuffer();

        System.out.println(sbf.equals(sbf2));           // equals method isn't overriden so ............false

        System.out.println("Length = "+sbf.length());
        System.out.println("Default Capacity = "+sbf.capacity());   //New capacity = (oldcapacity*2)+2


        sbf.append("Threadsafe & Mutable");
        System.out.println("Length = "+sbf.length());
        System.out.println("New Capacity = "+sbf.capacity());   //New capacity = (oldcapacity*2)+2

    }
}
