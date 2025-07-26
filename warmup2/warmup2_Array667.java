public class warmup2_array667
{
    public static void main(String[] args)
    {
      int[] sum = {6, 6, 2};
      System.out.println(array667(sum));
      
    }


public static int array667(int[] nums) {
  int count = 0 ;
	
   for(int i = 0 ; i < nums.length - 1; i++)
   {
      if(nums[i] == 6 && nums[i+1] == 6  || nums[i] == 6 && nums[i+1] == 7 )
	count++;
   }
   return count;
}
}