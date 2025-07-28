public class Array1_RotateLeft3 {
  public static void main(String args[]) {
    int[] nums = {1, 2, 3};
    int[] rotatedArray = rotateLeft3(nums);
    
    for(int x : rotatedArray)
    {
        System.out.println(x);
    }
  }
 
  public static int[] rotateLeft3(int[] nums) {
      int[] rotateLeft3 = {nums[1], nums[2], nums[0]};
      
      return rotateLeft3;
  }

}
