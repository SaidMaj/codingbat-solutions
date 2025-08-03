public class Array1_no23 {
  public static void main(String args[]) {
    int[] array =  {2, 3};
    System.out.println(no23(array));
  }
  
public static boolean no23(int[] nums) {
     return (nums[0] !=  2 && nums[1] !=  3) &&
           (nums[0] !=  3 && nums[1] !=  2 );
  }

}