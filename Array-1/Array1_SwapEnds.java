public class Array1_SwapEnds{
  public static void main(String args[]) {
    int[] array =  {2, 2 , 9, 7};
    int[] result = swapEnds(array) ;
    
    for(int number : result)
    {
        System.out.println(number);
    }
     
  }
  
  public static int[] swapEnds(int[] nums) {
      int arrayLength = nums.length;
      
      int temp = nums[0];
      nums[0] = nums[arrayLength-1];
      nums[arrayLength-1] = temp;
      
      return nums;
   }
}