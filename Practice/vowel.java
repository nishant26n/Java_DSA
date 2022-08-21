package Practice;

import java.util.Scanner;

public class vowel {

    public static boolean stringContainVowel(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        System.out.println(stringContainVowel(str));

        scan.close();
    }
}
