
public class Array1_Reverse3 {
  public static void main(String args[]) {
    int[] nums = {1, 2, 3};
    int[] reversedArray = rotateLeft3(nums);
    
    for(int x : reversedArray)
    {
        System.out.println(x);
    }
  }
 
  public  static int[] reverse3(int[] nums) {
  int[] reversedArray = {nums[2], nums[1], nums[0]};
  return reversedArray;
}


}