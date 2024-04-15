package array;

import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args) {
        int[] num = {23,25,67,87,45,34};
        swap(num, 1,4);
        System.out.println(Arrays.toString(num));
        for (int i = 0; i<num.length; i++){
            System.out.print(num[i]+ " ");
        }
    }
    static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
