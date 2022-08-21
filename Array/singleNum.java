package Array;

public class singleNum {

  static int singleNumber(int[] nums) {
    int single = 0, flag = 0;
    for (int i = 0; i < nums.length; i++) {
      flag = 0;
      single = nums[i];

      for (int j = 0; j < nums.length; j++) {
        if (nums[j] == single && j != i) {
          flag = 1;
        }
      }
      if (flag == 0) return single;
    }
    return single;
  }

  public static void main(String[] args) {
    int nums[] = { 4, 1, 2, 1, 2 };
    System.out.println(singleNumber(nums));
  }
}
