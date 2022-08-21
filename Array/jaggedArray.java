package Array;

public class jaggedArray {
    
    public static void main(String[] args){
        //2-D Array with 2 columns
        int arr[][] = new int[2][];

        // First Row has 3 columns
        arr[0] = new int[3];

        //Second row has 2 columns
        arr[1] = new int[2];

        //Initialisng Array
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = count++;
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
