package Algorithms;
import java.util.Arrays;

public class Bubble_Sort {
    static void sort(int arr[]){

        int len = arr.length;                                                 // len = 6
// iteration increases and pointer doesn't need to go upto the last
// because larger number goes to the last and get sorted

        for(int iteration=0; iteration<len-1; iteration++){                   // iteration = 0...4
            for (int pointer=0; pointer<len-iteration-1; pointer++){          // if iteration=0 then  pointer=0...4 and pointer+1=1...5
                if(arr[pointer]>arr[pointer+1]){
                    int temp = arr[pointer];
                    arr[pointer] = arr[pointer+1];
                    arr[pointer+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int myArray[] = {4,3,2,4,5,1};
        Bubble_Sort.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

}
