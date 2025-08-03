class array2_ZeroMax{
    public static void main(String[] args) {
        int[] array =  {0, 5, 0, 3};
        int[] result = zeroMax(array);
        for(int number : result)
        {
            System.out.println(number);
        }
    }
    
    
      public static int[] zeroMax(int[] nums) {
      
      int arrayLength = nums.length;
      int maxOdd = 0;
    
      if(arrayLength == 0)
      {
        return nums;
      }
    
      for(int i = arrayLength - 1 ; i != 0 ; i--)
      {
        if(nums[i] % 2 != 0)
        {
          maxOdd = Math.max(maxOdd,  nums[i]);
        }
          
        if(nums[i-1] == 0)
        {
          nums[i-1] = maxOdd ;
        }
    
      }
      
      return nums;
    }

}