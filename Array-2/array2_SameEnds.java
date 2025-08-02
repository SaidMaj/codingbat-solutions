class array2_SameEnds {
    public static void main(String[] args) {
        int[] array =  {1, 2, 3, 4, 4, 5};
        System.out.println(sameEnds(arra, 3));
    }
    
    
    public static boolean sameEnds(int[] nums, int len) {
      
      int arrayLength = nums.length;
      
      for(int i = 0 ; i < len; i++ )
      {
        if(nums[i] !=  nums[arrayLength + i - len])
        {
          return false;
        }
        
      }
      return true;
    }

}