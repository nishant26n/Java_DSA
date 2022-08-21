package Practice;

import java.util.Scanner;

public class removeWhitespace {

    static String removingWhiteSpace(String str){
        StringBuilder output = new StringBuilder();

        char[] charArray = str.toCharArray();

        for(char c: charArray){
            if(!Character.isWhitespace(c)) output.append(c);
        }

        return output.toString();
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        System.out.println(removingWhiteSpace(str));
        scan.close();
    }

}
