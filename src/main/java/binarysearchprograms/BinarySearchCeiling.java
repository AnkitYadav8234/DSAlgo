package binarysearchprograms;

public class BinarySearchCeiling {
    public static void main(String[] args) {
            int[] arr = {4,4,8,8,8,15,16,23,42};
        System.out.println(binarySearch(arr, 3));
    }

    static int binarySearch(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
                ans = arr[mid];
            }
        }
        return ans;
    }
}