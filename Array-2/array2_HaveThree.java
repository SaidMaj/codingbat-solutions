class array2_HaveThree {
    public static void main(String[] args) {
        int[] array =  {1, 2, 3, 4, 4, 5};
        // int[] array1 =  {1, 2, 3, 4, 4, 5};
        System.out.println(haveThree(array));
    }
    
    
   public static boolean haveThree(int[] nums) {
      int countThree = 0;
      int arrayLength = nums.length;
      
      for(int i = 0 ; i < arrayLength ; i++)
      {
        if(nums[i] == 3)
        {
          countThree++;
        }
        
        if(( (i + 1 <  arrayLength)  && nums[i] == 3 && nums[i+1] == 3) || countThree > 3 )
        {
          return false;
        }
        
      }
      
      return countThree == 3;
    }
}