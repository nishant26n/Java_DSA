package Questions;

import java.util.*;
import java.util.stream.Collectors;

public class UnionIntersectionList {
    

    public static void main(String[] args) {
        List<String> list1 =new ArrayList<String>(Arrays.asList("a","b","c","d","e")); 
        System.out.println("List 1 elemet is: "+ list1);

        List<String> list2 = new ArrayList<String>(Arrays.asList("f","a","b","i","j"));
        System.out.println("List 2 elemet is: "+ list2);

        // Union of two lists
        List<String> unionList = new ArrayList<String>();
        unionList.addAll(list1);
        unionList.addAll(list2);
        
        System.out.println("Union of List is: "+ unionList);

        //Intersection of two lists
        List<String> intesectList = list1.stream().filter(list2::contains).collect(Collectors.toList());
        if(!intesectList.isEmpty()){
           System.out.println("Intersection of lists is: "+ intesectList);
        }else{
            System.out.println(Collections.emptyList());
        }
    }

}
