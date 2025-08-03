class array2_Lucky13 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4};
        System.out.println(lucky13(arr));
    }
    public  static boolean lucky13(int[] nums) {
      int arrayLength = nums.length;
      
      for(int i = 0 ; i < arrayLength; i++ )
      {
        if(nums[i] == 1 || nums[i] == 3)
         {
           return false;
         }
      }
      
      return true;
    }
}