class array2_ZeroFront{
    public static void main(String[] args) {
        int[] array =  {1, 0, 0, 1};
        int[] result = zeroFront(array);
        for(int number : result)
        {
            System.out.println(number);
        }
    }
    
    
    public static int[] zeroFront(int[] nums) {
      
    
      // this variable used to count the numbers taht not zero
      int countNonZero = 0;
      int number = 0;
      int arrayLength = nums.length;
      int[] array = new int[arrayLength];
      
     // Counting NonZero numbers   
     for(int i = 0 ; i < arrayLength  ; i++)
     {
        if(nums[i] != 0)
        {
          number = nums[i];
          countNonZero++;
        }
     }
     
     // filling array with non zero numbers
     for(int i = (arrayLength - countNonZero) ; i < arrayLength  ; i++)
     {
        array[i] = number;
     }
    
      return array;
    }

}