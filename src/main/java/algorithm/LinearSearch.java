package algorithm;

public class LinearSearch {
    public static void main(String[] args) {
         int[] arr = {5,46,845,124,75,8,345};
        System.out.println(lSearch(arr, 8));
    }
    static int lSearch(int[] arr, int target){
        if (arr.length == 0) {
                return -1;
        }

        for (int i = 0; i < arr.length-1; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
