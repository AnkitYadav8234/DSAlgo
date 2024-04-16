package array;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,5},{7,3},{3,5}};
        int[][] arr1 = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts){
        int ans =  Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
