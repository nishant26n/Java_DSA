package Practice;

import java.util.Scanner;

public class fibonacciSeries {
    static int a=0, b=1, c=0;
    static void printFiboSeries(int count){
        if(count > 0){
            c = a+b;
            a = b;
            b = c;
            System.out.print(", "+ c);
            printFiboSeries(count-1);
        }
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter count number: ");
        int count = scan.nextInt();

        System.out.print(a+", "+b);
        printFiboSeries(count-1);
        scan.close();
    }

}
