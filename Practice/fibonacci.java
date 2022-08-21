package Practice;

import java.util.Scanner;

public class fibonacci {

    static int getFibonacciNumber(int num){
        if(num<=1) return 1;
        return getFibonacciNumber(num-1) + getFibonacciNumber(num-2);
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        System.out.println(getFibonacciNumber(num-1));
        scan.close();
    }
}
