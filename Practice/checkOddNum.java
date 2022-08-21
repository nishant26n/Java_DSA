package Practice;

import java.util.ArrayList;
import java.util.List;

public class checkOddNum {
    
    public static boolean checkingOdd(List<Integer> list){
        for(int i: list){
            if(i%2 == 0) return true;
        }
        return false;
    }

    public static void main(String[] args){
        List<Integer> list=new ArrayList<Integer>();  
        
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(7);

        System.out.println(checkingOdd(list));
    }

}
