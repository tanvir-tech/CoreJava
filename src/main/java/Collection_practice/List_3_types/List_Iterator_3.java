package Collection_practice.List_3_types;


import java.util.*;

public class List_Iterator_3 {
    public static void main(String[] args) {
        List arl = new ArrayList();               //ArrayList -> AbstractList -> AbstractCollection & imp___List
        for (int i=1;i<5;i++){
            arl.add(i);
        }


        ListIterator litr = arl.listIterator();
        while(litr.hasNext()){               //check if iterator has the elements
            System.out.println(litr.next()); //printing the element and move to next
        }
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }





    }
}
