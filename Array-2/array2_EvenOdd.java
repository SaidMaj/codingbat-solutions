class array2_EvenOdd{
    public static void main(String[] args) {
        int[] array =  {2, 5, 4, 3};
        int[] result = evenOdd(array);
        for(int number : result)
        {
            System.out.println(number);
        }
    }
    
    
    public static int[] evenOdd(int[] nums) {
      int arrayLength = nums.length;
      int array[] = new int[arrayLength];
      int index = 0;
      
      for(int i = 0 ; i < arrayLength ; i++ )
      {
        if(nums[i] % 2 == 0)
        {
          array[index] =  nums[i];
          index++;
        }
      }
      
      
      for(int i = 0 ; i < arrayLength ; i++ )
      {
        if(nums[i] % 2 != 0)
        {
          array[index] =  nums[i];
          index++;
        }
      }
      
      return array;
      
    }

}