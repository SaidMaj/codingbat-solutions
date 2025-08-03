public class Array1_MakeEnds {
  public static void main(String args[]) {
    int[] array =  {2, 3, 4};
    int[] result = makeEnds(array);
    
    for(int number : result)
    {
        System.out.println(number);
    }
  }
  
  public static int[] makeEnds(int[] nums) {
  int ArrayLengths = nums.length;
  int[] arraymakeEnds = {nums[0], nums[ArrayLengths - 1]};
  
  return arraymakeEnds;
  }

}