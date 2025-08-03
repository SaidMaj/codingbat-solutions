class array2_No14 {
    public static void main(String[] args) {
        int[] array =  {1, 2, 3, 4, 4, 5};
        System.out.println(no14(array));
    }
    
    public static boolean no14(int[] nums) {
      boolean containsOne = false;
      boolean containsFour = false;
      
      for(int number : nums)
      {
        if(number == 1)
        {
          containsOne = true;
        }
        if(number == 4)
        {
          containsFour = true;
        }
        if(containsOne && containsFour)
        {
          return false;
        }
      }
      
      return !(containsOne && containsFour);
    }


}