
public class FirstLast6 {
  public static void main(String args[]) {
    int[] nums = {1,2,3,4,4,6};
    System.out.println(firstLast6(nums));
  }
 
    public static boolean firstLast6(int[] nums) {
      int arrayLength = nums.length;
      return nums[0] == 6 || nums[arrayLength-1] == 6; 
    }

}