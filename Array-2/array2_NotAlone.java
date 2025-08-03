class array2_NotAlone{
    public static void main(String[] args) {
        int[] array =  {21, 2, 3};
        int[] result = notAlone(array, 2);
        for(int number : result)
        {
            System.out.println(number);
        }
    }
    
    
    public static int[] notAlone(int[] nums, int val) {
      int arrayLength = nums.length;
      
      for(int i = 1 ; i < arrayLength - 1; i++)
      {
        if(nums[i] == val &&  (nums[i] != nums[i + 1]  && nums[i] != nums[i - 1]))
        {
          nums[i] = Math.max(nums[i + 1] , nums[i - 1]);
        }
      } 
      
      return nums;
    }


}