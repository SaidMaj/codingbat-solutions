class array2_TripleUp {
    public static void main(String[] args) {
        int[] array =  {1, 4, 5, 6, 2};
        // int[] array1 =  {1, 2, 3, 4, 4, 5};
        System.out.println(tripleUp(array));
    }
    
    
    public static boolean tripleUp(int[] nums) {
      int arrayLength = nums.length;
      
      for(int i = 0 ; i < arrayLength - 2; i++)
      {
        if((nums[i+1] == nums[i] + 1) && (nums[i+2] == nums[i + 1] + 1) )
        {
          return true;
        }
      }
       return false;
    }

}