public class Array1_Has23 {
  public static void main(String args[]) {
    int[] array =  {2, 3, 4};
    System.out.println(has23(array));
  }
  
 public static boolean has23(int[] nums) {
   return nums[0] ==  2 || nums[0] ==  3 || 
   nums[1] ==  2 || nums[1] ==  3 ;
  }


}