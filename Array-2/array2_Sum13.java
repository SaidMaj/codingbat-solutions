class array2_Sum13 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        System.out.println(sum13(nums));
    }

    public static int sum13(int[] nums) {
      int sum = 0 ;
      int arrayLength = nums.length ;
      
    
      for(int i = 0 ; i < arrayLength ; i++)
      {
        if(nums[i] == 13)
        {
           i++;
        }
        else
        {
            sum += nums[i];      
        }
      }
       return sum;
    }

}