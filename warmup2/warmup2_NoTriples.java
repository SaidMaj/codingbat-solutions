public class warmup2_NoTriples
{
    public static void main(String[] args)
    {
      int[] sum = {1,1,1,1,1,1,1,1,};
      System.out.println(noTriples(sum));
      
    }


    public static boolean noTriples(int[] nums) {
      
        for(int i = 0 ; i < nums.length - 2; i++)
        {
              if(nums[i] == nums[i+1]  && nums[i+1] == nums[i+2] )
                return false;
        }
        return true;
    }
}