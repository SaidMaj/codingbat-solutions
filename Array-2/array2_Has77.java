class array2_Has77 {
    public static void main(String[] args) {
        int[] array =  {1, 2, 3, 4, 4, 5};
        System.out.println(has77(array));
    }
    
    public static boolean has77(int[] nums) {
      int arrayLength = nums.length - 1;
      
      for(int i = 0; i < arrayLength ; i++)
      {
        if(nums[i] == 7 && nums[i + 1] == 7  || ( (i+2 < nums.length) && nums[i] == 7 && nums[i + 2] == 7))
        {
          return true;
        }
      }
      
      return false;
    }


}