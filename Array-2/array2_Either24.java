class array2_Either24{
    public static void main(String[] args) {
         int[] array =  {1, 2, 3, 4, 4, 5};
        System.out.println(either24(array));
    }
    
    
    public static boolean either24(int[] nums)
    {
      
      int arrayLength = nums.length;
      boolean contains2 = false; 
      boolean contains4 = false; 
    
      for(int i = 0 ; i < arrayLength - 1 ; i++)
      {
            if(nums[i] == 2 && nums[i + 1] == 2)
            {
              contains2 = true;
            }
          
            if(nums[i] == 4 && nums[i + 1] == 4)
            {
              contains4 = true;
            }
            
      }
      
     if(contains2 && contains4 || !contains2 && !contains4 )
      {
          return false;
      }
        
        
      return !(contains4 && contains2);
    }


}