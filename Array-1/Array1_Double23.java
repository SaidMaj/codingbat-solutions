public class Array1_Double23 {
  public static void main(String args[]) {
    int[] array =  {2, 9};
    System.out.println(double23(array));

  }
  
  public static boolean double23(int[] nums) {
  
    if(nums.length > 1 && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)))
      return true;
  
    return false;
  }

}