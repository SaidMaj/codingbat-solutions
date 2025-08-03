class array2_Pre4{
    public static void main(String[] args) {
        int[] array =  {2, 10, 3, 4, 20, 5};
        int[] result = pre4(array);
        for(int number : result)
        {
            System.out.println(number);
        }
    }
    
    
    public static int[] pre4(int[] nums) {
      int countElements = 0;
      
      //counting number of element before four
      for(int i = 0 ; i < nums.length ; i++)
      {
        if(nums[i] == 4)
        {
          break;
        }
        countElements++;
      }
    
      int[] result = new int[countElements]; 
      
      //adding element to array
      for(int i = 0 ; i < countElements ; i++)
      {
         result[i] = nums[i] ;
      }
      
      
      return result;
      
    }

}