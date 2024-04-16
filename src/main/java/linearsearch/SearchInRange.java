package linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {23, 25, 67, 87, 45, 34};
        System.out.println(linearSearch(arr, 45, 1, 3));

    }


private static boolean linearSearch(int[] arr, int target, int start, int end) {
    if (arr.length == 0) {
        return false;
    }
    for (int index = start; index <= end; index++) {
        if (arr[index] == target) {
            return true;
        }
    }
    return false;
}
}

