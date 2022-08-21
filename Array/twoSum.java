package Array;

public class twoSum {
    
    private static int[] findTwoSum_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String args[]){
       
        int target = 6;
        int nums[] = {1,2,4,2};
        System.out.println(findTwoSum_BruteForce(nums, target));

    }

}

