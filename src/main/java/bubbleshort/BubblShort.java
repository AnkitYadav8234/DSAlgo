package bubbleshort;

import java.util.Arrays;

public class BubblShort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            //for rach step, max value will come at last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than previous item
                if (arr[j] < arr[j - 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] =  arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
