class array2_Post4{
    public static void main(String[] args) {
        int[] array =  {2, 10, 3, 4, 20, 5};
        int[] result = post4(array);
        for(int number : result)
        {
            System.out.println(number);
        }
    }
    
    
    public static int[] post4(int[] nums) {
      int index = 0;
      int arrayLength = nums.length;
      int newArrayLength = 0;
      
      // I just created this for loop to find the index  4
      for(int i = 0 ; i < arrayLength ; i++)
      {
        if(nums[i] == 4)
        {
          index = i;
        }
      }
      
      // I increment  index by one to exlude the four 
      index++;
      
      newArrayLength = arrayLength - index ;
      
      int[] result = new int[newArrayLength];
    
      for(int i = 0 ; i < newArrayLength ; i++)
      {
         result[i] = nums[index];
         index++;
      
      }
  
    return result;
   }


}