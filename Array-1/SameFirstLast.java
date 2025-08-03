public class SameFirstLast {
  public static void main(String args[]) {
    int[] nums = {1,2,3,4,4,6};
    System.out.println(sameFirstLast(nums));
  }
 
    public static boolean sameFirstLast(int[] nums) {
   int arrayLength = nums.length;
   return arrayLength >= 1 && nums[arrayLength-1] == nums[0]; 
    }
}