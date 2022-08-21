package Practice;

public class sortingArray {

    static void sorting(int arr[]){

        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];  //Swapping
                    arr[i] = arr[j];    
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args){
        
        int arr[] = {2,4,1,10,9};

        sorting(arr);
    }

}
