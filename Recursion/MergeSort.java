package Recursion;

import java.util.Scanner;

public class MergeSort {
    
    static void Merge(int L[], int R[], int a[]) {
        int nL = L.length;
        int nR = R.length;

        int i,j,k;
        i=j=k=0;
        
        //If number of elements in an array is 8 then Loop will run till i = 4 or j = 4
        while(i<nL && j< nR) {		
			 if(L[i]<=R[j]) {
                //Placing the sorted value in an array from left side array
				 a[k] = L[i];		
				 i++;
			 }else {
                //Placing the sorted value in an array from right side array
				 a[k] = R[j];		
				 j++;
			 }
			 k++;
		 }
		 
		 while(i<nL) {		//If elements get remains in left side array
			 a[k] = L[i];
			 i = i+1;
			 k = k+1;
		 }
		 while(j<nR) {		//If elements get remains in right side array
			 a[k] = R[j];
			 j = j+1;
			 k = k+1;
		 }
    }

    static void MergeSorting(int a[]){
        int n = a.length;

        // Base case
        //If there is only 1 element in left or right side array then return
        if(n<2){
            return;
        }

        //Finding the middle value to divide an array into two part
        int mid = n/2;
        //If total elements in an array is 8 then left side elements index be like 0,1,2,3
        int[] left = new int[mid];
        //Right side elements index be like (8-4, 8-3, 8-2, 8-1) = 4,5,6,7
        int[] right = new int[n-mid];

        for(int i =0; i<=mid-1; i++) {
            left[i] = a[i];
        }
        for(int i=mid; i<=n-1; i++) {
            right[i-mid] = a[i];
        }

        //Recursive call
        MergeSorting(left);
        MergeSorting(right);
        Merge(left, right, a);
    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int n = scan.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++){
            a[i] = scan.nextInt();
        }

        MergeSorting(a);

        System.out.println("SORTED ARRAY");
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        scan.close();
    }

}
