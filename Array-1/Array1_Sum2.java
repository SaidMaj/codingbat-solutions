public class Array1_Sum2 {
  public static void main(String args[]) {
    int[] array = {1, 2, 3, 4};

    System.out.println(sum2(array));
  }
  
  public static int sum2(int[] nums) {
  int arrayLength = nums.length;
  
  if (arrayLength == 0)
      return 0;
    
  if (arrayLength == 1)
      return nums[0];
    
      return nums[0] + nums[1];
  }

}