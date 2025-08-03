class array2_TenRun{
    public static void main(String[] args) {
        int[] array =  {2, 10, 3, 4, 20, 5};
        int[] result = tenRun(array);
        for(int number : result)
        {
            System.out.println(number);
        }
    }
    
    
    public static int[] tenRun(int[] nums) {
      int number = 0;
      // I have created this variable onece multiple of 10 found it will be true
      boolean find = false;
      
      for(int i = 0 ; i < nums.length ; i++)
      {
        if(nums[i] % 10 == 0)
        {
          number = nums[i];
          find = true;
        }
        
        if(find && nums[i] % 10 != 0)
        {
            nums[i] = number;
        }
      }
      
      return nums;
    }
}