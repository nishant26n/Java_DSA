package Array;

import java.util.Arrays;

class MergeSortedArray{

        public static void MergeSortedArr(int[] nums1, int m , int[] nums2, int n ){
        
        int len = m + n;
        
        int [] mergeArr = new int [len];
        
        for(int i=0; i<m; i++){
            mergeArr[i] = nums1[i];
        }
        
        for(int i=0; i<n; i++){
            mergeArr[m+i] = nums2[i];
        }
        
        for(int i=0; i<len; i++){
            Arrays.sort(mergeArr);
            System.out.println(mergeArr[i]);
        }

        }

        public static void main(String[] args){

            int nums1[] = {1,2,3,0,0,0};
            int nums2[] = {2,5,6};
            int m =3;
            int n = 3;

            MergeSortedArr(nums1, m, nums2, n);


        }

    }

