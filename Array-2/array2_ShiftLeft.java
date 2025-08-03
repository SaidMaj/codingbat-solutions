class array2_ShiftLeft{
    public static void main(String[] args) {
        int[] array =  {1, 4, 5, 6, 2};
        int[] result = shiftLeft(array);
        for(int number : result)
        {
            System.out.println(number);
        }
    }
    
    
    public static int[] shiftLeft(int[] nums) {
      int temp = 0;
      
      for(int i = 0 ; i < nums.length - 1; i++)
      {
        temp = nums[i];
        nums[i] = nums[i + 1];
        nums[i + 1] = temp;
      }
      
      return nums;
    }


}