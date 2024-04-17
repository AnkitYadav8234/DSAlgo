package binarysearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {4,7,7,7,8,56,200};
        System.out.println(Arrays.toString(searchInRange(arr, 8)));
    }
    static int[] searchInRange(int[] arr, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(arr,7,true);
        ans[1] = search(arr,7,false);
        return ans;
    }
    static int search(int[] arr, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (end >= start){
            int mid =  start + (end-start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }

            }
        }
        return ans;
    }
    }

