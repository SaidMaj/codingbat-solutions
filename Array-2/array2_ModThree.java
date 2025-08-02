class array2_ModThree {
    public static void main(String[] args) {
        int[] array =  {1, 2, 3, 4, 4, 5};
        // int[] array1 =  {1, 2, 3, 4, 4, 5};
        System.out.println(modThree(array));
    }
    
    
    public static boolean modThree(int[] nums) {
      int remainder = 0;
      
      for(int i = 0 ; i < nums.length - 2; i++)
      {
        remainder = nums[i] % 2;
        if(((nums[i + 1] % 2) == remainder)   &&  ( (nums[i + 2] % 2) == remainder ) )
        {
          return true;
        }
      }
      return false;
    }

}