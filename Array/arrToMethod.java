package Array;

public class arrToMethod {

    public static void main(String[] args){
        int arr[] = {3,4,5,6};

        //Parsing array to method
        sum(arr);
    }

    public static void sum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println("Sum of Array values: "+ sum);
    }


}

