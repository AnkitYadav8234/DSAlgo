package misc;


import java.util.Arrays;

public class MathsPrograms {
    public static void main(String[] args) {
//        decimalToAnyBase(357, 10);
//        binaryToAnyBase(101, 2);
//        findEvenOdd(9);
//        reverseNumber(23445);
//        power(6, 2);
//        fastExponentiation(2, 3);
//        countDigitOfNum(132);
//        countDigitsViaLog(132);
//        armstrongNumber(153);
//        palindrome(1221);
//        printAllDivisor(24);
//        primeNumber(25);
//       sieveAlgorithm(40);
//       System.out.println(newtonRaphsonSqRoot(25));

    }
     static double newtonRaphsonSqRoot(int num){
        double tol = 0.0001;
        double root;
        double X = num;
        while(true){
            root = 0.5 * (X + (num/X));
            double ans = X - root;
            if(ans < tol){
                break;
            }
            X = root;
        }
        return root;
    }
     static void sieveAlgorithm(int num) {
         boolean[] arr = new boolean[num+1];
         int counter = 2;
         Arrays.fill(arr,true);
         while (counter<= num){
             if (arr[counter] == true){
                 for (int factor =counter + counter; factor <= num; factor+= counter ){
                     arr[factor] = false;
                 }
             }
             counter++;
         }
         for (int i = 2; i<=num; i++){
             System.out.println(i + " : "+arr[i]);
         }
     }
     static void primeNumber(int num) {
         int counter = 2;
         int sqroot = (int) Math.sqrt(num);
         while (counter <= sqroot) {
             if (num % counter == 0) {
                 System.out.println(num + " is not a prime number");
                 return;
             }
             counter++;
         }
         System.out.println(num + " is a prime number");
     }
     static void printAllDivisor(int num) {
         int counter = 1;
         int sqroot = (int)Math.sqrt(num);
         while (counter <= sqroot) {
             if(num % counter == 0){
                 System.out.println(counter + " is a divisor of "+ num);
                 int otherNumber =  num/counter;
                 if (otherNumber != counter){
                     System.out.println(otherNumber+" is a divisor of "+ num);
                 }

             }
             counter++;
         }
     }
     static void palindrome(int numb) {
        int rev = 0;
        int copy  = numb;
        while (numb > 0){
            int digit = numb % 10;
            rev = rev*10 + digit;
            numb/=10;
        }
        if (rev == copy){
            System.out.println("The number is Palindrome");
        }else {
            System.out.println("The number is not a Palindrome");
        }
    }
    static void armstrongNumber(int num) {
        int res  = 0;
        int copy =  num;
        while (num > 0){
            int digit = num % 10;
            res = res + (int)Math.pow(digit, 3);
            num/=10;
        }
        if (res ==copy){
            System.out.println("The Number is Armstrong.");
        }else {
            System.out.println("The Number is not an Armstrong.");
        }
    }
    static void countDigitsViaLog(int num){
        if(num==0){
            System.out.println("Digits are : 1");
            return;
        }
//        int count = (int)((int)Math.log(num) / Math.log(10))+1;
        int count = (int)Math.log10(num) + 1;
        System.out.println("Digits are :"+ count);
    }
    static void countDigitOfNum(int num) {
        if(num == 0)
            System.out.println("Digits are : " + 1);
        else {
            int counter = 0;
            while (num > 0) {
                num /= 10;
                counter++;
            }
            System.out.println("Digits are : " + counter);
        }

    }
    static double fastExponentiation(int num, int power) {
        double res = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                res = res * num;
            }
            power /= 2;
            num = num * num;
        }
        System.out.println("The power of " + num + " is " + res);
        return res;
    }
    static double power(int num, int power) {
        double res = 1;
        for (int i = 0; i < power; i++) {
            res = res * num;
        }
        System.out.println("The power of " + num + " is " + res);
        return res;
    }
    static void reverseNumber(int num) {
        int revNum = 0;
        while (num > 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse number is : " + revNum);

    }
    static void findEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("The number is even : " + num);
        } else {
            System.out.println("The number is odd : " + num);
        }
    }
    static void binaryToAnyBase(int binaryNum, int base) {
        int resNum = 0;
        int power = 0;

        while (binaryNum > 0) {
            resNum += binaryNum % base * Math.pow(2, power);
            binaryNum /= base;
            power++;
        }
        System.out.println("Result is : " + resNum);
    }
    static void decimalToAnyBase(int decimalNumber, int base) {
        int resNum = 0;
        int power = 0;
        while (decimalNumber > 0) {
            resNum += ((decimalNumber % base) * (Math.pow(10, power)));
            decimalNumber /= base;
            power++;
        }
        System.out.println("Result is : " + resNum);
    }
}
