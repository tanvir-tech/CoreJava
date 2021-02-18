package Collection_practice.List_3_types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist_1 {
    public static void main(String[] args) {
        List arl = new ArrayList();               //ArrayList -> AbstractList -> AbstractCollection & imp___List

        for (int i=1;i<5;i++){
            arl.add(i);
        }
        arl.add("tanvir");                                         //add shifts element while adding new element
        arl.set(4,"This sentence is setted by replacing tanvir");  //set doesn't shift element while adding new element

        //Traversing list through Iterator
        Iterator itr=arl.iterator();        //getting the Iterator
        while(itr.hasNext()){               //check if iterator has the elements
            System.out.println(itr.next()); //printing the element and move to next
        }

        System.out.println(arl.remove(new Integer(4)));        // remove as Object element and returns BOOLEAN
        System.out.println(arl.toString());                          //toString is implemented by AbstractCollection class


    }
}
