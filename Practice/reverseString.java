package Practice;

import java.util.Scanner;

public class reverseString {

    static String reverse(String str){
        if(str == null) throw new IllegalArgumentException("Null is not valid input");

        char ch;
        String rev = "";
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            rev = ch+ rev;
        }
        return rev;
    }
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        System.out.println(reverse(str));

        scan.close();
    }

}
