package array;

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = new int[]{12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] arr){
        int count = 0;
        for (int index = 0; index < arr.length; index++){
            if(even(arr[index])){
                count++;
            }
        }
        return count;
    }

    static boolean even(int arr) {
        int numberOfDigit = countDigit(arr);
        if(numberOfDigit % 2 == 0){
            return true;
        }
        return false;

    }
    static int countDigit(int num){
        if(num < 0){
             num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
    static int countDigit2(int num){
        return (int) (Math.log10(num) + 1);
    }
}
