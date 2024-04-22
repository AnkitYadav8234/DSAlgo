package binarysearchprograms;

public class CountOccurence {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 4, 4, 6, 8, 9};
        int first = binarySearch(arr, 4, true);
        int last = binarySearch(arr, 4, false);

        System.out.println("Occurence of target element is : " + (last - first + 1));
    }

    static int binarySearch(int[] arr, int target, boolean isFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }


            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
