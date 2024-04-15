package array;

public class MaxOfArrayInRange {
    public static void main(String[] args) {
        int[] num = {23,25,67,87,45,34};
        System.out.println(max(num,0,2));
    }

    static int max(int arr[],int start, int end){
        if(end > start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int mx = arr[0];
        for (int i = start; i <= end; i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }
}
