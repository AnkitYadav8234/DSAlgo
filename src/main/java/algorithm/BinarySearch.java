package algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,34,46,76,98,981,100};
        System.out.println(bSearch(arr, 981));
    }
    static int bSearch(int[] arr, int target){
        int start = 0;
        int end =  arr.length - 1;

        if (arr.length == 0) {
            return -1;
        }

        while (end >= start){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end =  mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
