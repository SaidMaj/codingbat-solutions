public class warmup2_ArrayCount9
{
    public static void main(String[] args)
    {
        int[] arrayOfNumbers = { 1, 2, 9};
        System.out.println(arrayCount9(arrayOfNumbers));
    }
    
 
      public static int arrayCount9(int[] nums) {
      int count = 0;
      
      for(int i = 0 ; i < nums.length; i++)
      {
        if(nums[i] == 9)
          count++;
      }
      
      return count;
    }

}