class array2_Has12 {
    public static void main(String[] args) {
        int[] array =  {1, 2, 3, 4, 4, 5};
        // int[] array1 =  {1, 2, 3, 4, 4, 5};
        System.out.println(has12(array));
    }
    
    public static boolean has12(int[] nums) {
      boolean isAOne = false;
      boolean isATwo = false;
    
      for(int number : nums)
      {
        if(number == 1)
        {
          isAOne = true;
        }
        if(isAOne && number == 2)
        {
          isATwo = true;
        }
      }
      
      return isAOne && isATwo;
    }


}