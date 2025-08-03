public class warmup2_Array123
{
    public static void main(String[] args)
    {
        int[] arrayOfNumbers = {1, 1, 1, 1, 1, 1, 1, 1, 2,3 };
        System.out.println(array123(arrayOfNumbers));
    }
    
 
  public static boolean array123(int[] nums) {
      int arrayLength = nums.length;
      
      if(arrayLength < 3)
          return false;
        
      if(arrayLength >= 3)
          arrayLength -= 3; //I have used this to avoid out of boundary  ArrayIndexOutOfBoundsExceptio
    
      for(int i = 0 ; i <= arrayLength; i++ )
      {
        if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3)
            return true;
      }
      
      return false;
}


}