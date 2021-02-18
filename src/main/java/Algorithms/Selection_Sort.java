package Algorithms;
import java.util.Arrays;

public class Selection_Sort {

    static void sort(int arr[]){
        int len = arr.length;                                                 // len = 6

        for(int iteration=0; iteration<len-1; iteration++){                   // iteration = 0...4

            int index_of_minimum = iteration;
            // find index of smaller number
            for (int pointer=iteration+1; pointer<len; pointer++){

                if(arr[index_of_minimum] > arr[pointer] ){
                    index_of_minimum = pointer;
                }
            }
            //swap
            int temp = arr[index_of_minimum];
            arr[index_of_minimum] = arr[iteration];
            arr[iteration]=temp;
        }
    }
    public static void main(String[] args) {
        int myArray[] = {4,3,2,4,5,1};
        Selection_Sort.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

}
