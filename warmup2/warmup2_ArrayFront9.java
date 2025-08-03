public class warmup2_ArrayFront9
{
    public static void main(String[] args)
    {
        int[] arrayOfNumbers = { 1, 2, 9};
        System.out.println(arrayFront9(arrayOfNumbers));
    }
    
 
    public static  boolean arrayFront9(int[] nums) {
      
      int arrayLength = 4;
      
      if(nums.length < 4)
          arrayLength = nums.length;
      
      
      for(int i = 0 ; i < arrayLength ; i++)
      {
          if(nums[i] == 9)
              return true;
      }
      
      
      return false;
    }


}