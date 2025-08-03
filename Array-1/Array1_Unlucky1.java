public class Array1_Unlucky1 {
  public static void main(String[] args) {
    int[] array = { 9, 10, 1 };
    System.out.println(unlucky1(array));
  }

  public static boolean unlucky1(int[] nums) {
      int arrayLength = nums.length;
      
      if(arrayLength <= 1 ) 
      {
        return false;
      }
      
      return (nums[0] == 1 &&  nums[1] == 3) || (nums[1] == 1 &&  nums[2] == 3) ||  (nums[arrayLength - 2] == 1 &&  nums[arrayLength - 1] == 3);
  }

}