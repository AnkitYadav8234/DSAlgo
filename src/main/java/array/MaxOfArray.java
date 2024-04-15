package array;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] num = {23,25,67,87,45,34};
        System.out.println(max(num));
    }

    static int max(int arr[]){
        if(arr.length == 0){
            return -1;
        }

        int mx = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }
}

