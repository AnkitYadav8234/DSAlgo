package binarysearch;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {34,65,87,98,100};
        System.out.println(binarySearch(arr, 98));

    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (end >= start){

            int mid = start + (end - start)/2;

            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end =  mid - 1;
            }else {
                return mid;
            }
        }
        return -1;

    }
}
