package array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num = {23,25,67,87,45,34};
        System.out.println(Arrays.toString(num));
        reverse(num);
        System.out.println(Arrays.toString(num));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (end > start){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
