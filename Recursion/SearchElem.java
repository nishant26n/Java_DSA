package Recursion;

public class SearchElem {

    static int arr[] = {2,4,6,1,7,8};

    public static int Searching(int[] arr, int l, int r, int x) {
        if(r < l){
            return -1;
        }
        if(arr[l] == x){
            return l;
        }
        if(arr[r] == x){
            return r;
        }
        return Searching(arr, l+1, r-1, x);
    }
    
    public static void main (String[] args){

        int x = 7;

        int index = Searching(arr, 0, arr.length-1, x);

        if(index != -1){
            System.out.println(x + " is present at index " + index );
        }else{
            System.out.println(x + "is not present");
        }

    }

}
