package Practice;

import java.util.Scanner;

public class palindrome {

    static boolean checkPalindrome(String str){
        
        String rev = "";
        boolean result = false;
        
        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)){
            result = true;
        }
        return result;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome: ");
        String str = scan.nextLine();

        str = str.toLowerCase();
        boolean A = checkPalindrome(str);
        System.out.println(A);
        scan.close();
    }

}
