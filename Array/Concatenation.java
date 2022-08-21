package Array;

public class Concatenation {

    public static void getConcatenation(int[] nums) {

         int n = nums.length;

         int[] ans = new int[n * 2];
         
         for (int i = 0; i < n; ++i)
            ans[i] = ans[i + n] = nums[i];

        System.out.println(ans);
    }
    
    public static void main(String[] args) {
        
        int [] nums = {1,2,1};
        getConcatenation(nums);

    }

}
