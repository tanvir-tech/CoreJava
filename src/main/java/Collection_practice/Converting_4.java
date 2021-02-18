package Collection_practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Converting_4 {
    public static void main(String[] args) {

        List arl = new ArrayList();               //ArrayList -> AbstractList -> AbstractCollection & imp___List
        for (int i=1;i<5;i++){
            arl.add(i);
        }


        List ldl = new LinkedList();
        ldl.addAll(arl);                // Conversion from Arraylist to LinkedList


        System.out.println(ldl);
    }
}
