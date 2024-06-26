package selectionsort;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
            int[] arr = {5,4,3,2,1};
            selection(arr);
            System.out.println(Arrays.toString(arr));
        }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max itme in the remaining array and swap with the correct index 
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] arr, int start, int last){
        int max = start;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] =  arr[second];
        arr[second] = temp;
    }
}
