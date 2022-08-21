package Practice;

import java.util.Scanner;

public class primeOrNot {

    static boolean checkPrime(int num){
        if(num == 0 || num==1) return false;

        if(num == 2) return true;

        for(int i=2; i<=num/2; i++){
            if(num%i==0) return false;   
        }

        return true;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        System.out.println(checkPrime(num));
        scan.close();
    }

}
