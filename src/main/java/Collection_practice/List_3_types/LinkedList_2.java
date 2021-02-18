package Collection_practice.List_3_types;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList_2 {
    public static void main(String[] args) {
        LinkedList ldl = new LinkedList();

        for (int i=1;i<5;i++){
            ldl.add(i);
        }

        ldl.addAll(3, Arrays.asList(11,22,33,44));    // add a collection in specified index
        System.out.println(ldl);

        ldl.addFirst("tanvir");                          // only for LinkedList
        System.out.println(ldl);

        System.out.println(ldl.remove());                   // remove the FIRST element and returns that ELEMENT
        System.out.println(ldl);                            //toString is implemented by AbstractCollection class

        for (int i=1;i<5;i++){
            System.out.println("Peek//Topper is ="+ldl.peek());       // returns the TOPPER / PEEK
            System.out.println("Pulled the TOP number ="+ldl.poll()); // returns TOP element without deleting
        }
        for (int i=1;i<5;i++){
            System.out.println("Pulled the TOP number ="+ldl.pop()); // returns TOP element with DELETING
            System.out.println(ldl);
        }


    }
}