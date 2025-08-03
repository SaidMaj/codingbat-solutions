public class Array1_MaxEnd3 {
  public static void main(String args[]) {
    int[] nums = {1, 2, 3};
    int[] arrayMaxEnd3 = maxEnd3(nums);
    
    for(int x : arrayMaxEnd3)
    {
        System.out.println(x);
    }
  }
 
  public static int[] maxEnd3(int[] nums) {
  int max = Math.max(nums[0], nums[2]);
  int[] arrayMaxEnd3 = {max, max, max};
  
  return arrayMaxEnd3;
  }


}