package array;

import java.util.Arrays;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,54},
                {18,12}
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int mx = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] > mx){
                    mx = arr[row][col];
                }
            }
        }
        return mx;
    }
}
