package binarysearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceilingOfNumber(arr, 11));
    }
    static int ceilingOfNumber(int[] arr, int target){
        int start = 0;
        int end  = arr.length - 1;

        while (end >= start){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {return mid;}

        }
        return start;
    }
}
