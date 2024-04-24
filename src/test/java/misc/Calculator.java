package misc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();
        do {
            System.out.println("Choose an Operation: (*,+,-,%,/,)");
            System.out.print("->");
            String input = sc.next();
            char ch = input.charAt(0);
            if (input.length() != 1){
                System.out.println("Wrong input, please try again.");
            }else {
                obj.chooesOperation(ch);
            }
            boolean exit = obj.exitProgram();
            if (exit) {
                break;
            }

        } while (true);
        System.out.println("Thanks for using service");
    }

    public  void chooesOperation(char ch) {
        Scanner sc = new Scanner(System.in);
        switch (ch) {
            case '*':
                int num1 = getInteger(sc);
                int num2 = getInteger(sc);
                System.out.println("Result is "+ (num1 * num2));
                break;
            case '+':
                int num3 = getInteger(sc);
                int num4 = getInteger(sc);
                System.out.println("Result is "+ (num3 + num4));
                break;
            case '-':
                int num5 = getInteger(sc);
                int num6 = getInteger(sc);
                System.out.println("Result is "+ (num5 - num6));
                break;
            case '%':
                int num7 = getInteger(sc);
                int num8 = getInteger(sc);
                if (num8 == 0){
                    System.out.println("Divide by zero error");
                    break;
                }
                System.out.println("Result is "+ (num7 % num8));
                break;
            case '/':
                int num9 = getInteger(sc);
                int num10 = getInteger(sc);
                if (num10 == 0){
                    System.out.println("Divide by zero error");
                    break;
                }
                System.out.println("Result is "+ (num9 / num10));
                break;
            default:
                System.out.println("default");
        }
    }

    private int getInteger(Scanner sc) {
        return sc.nextInt();
    }

    public boolean exitProgram(){
        int times = 0;
        int retry = 5;
        Scanner sc = new Scanner(System.in);
        for (times = 0; times < retry; times++) {
            System.out.println("Do you want to continue (y/n)");
            String exitInput = sc.next();
            char ch1 = exitInput.charAt(0);
            if (exitInput.length() == 1 && ch1 == 'n') {
              return true;
            } else if (ch1 == 'y') {
                return false;
            } else {
                System.out.println("Wrong Input, Please try again.");
            }
        }
        if (times >= retry) {
            System.out.println("Maximum retry count exceeded! Exiting forcefully.");
            return true;
        }
        return false;
    }
}
