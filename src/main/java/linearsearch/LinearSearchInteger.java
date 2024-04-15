package linearsearch;

public class LinearSearchInteger {
    public static void main(String[] args) {
        int[] arr = {23,25,67,87,45,34};
        System.out.println(linearSearch(arr, 45));
        System.out.println(linearSearch2(arr, 45));
        System.out.println(linearSearch3(arr, 45));
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index <arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for(int index = 0; index <arr.length; index++){
            if(arr[index] == target){
                return arr[index];
            }
        }
        return Integer.MAX_VALUE;
    }
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int index = 0; index <arr.length; index++){
            if(arr[index] == target){
                return true;
            }
        }
        return false;
    }
}
