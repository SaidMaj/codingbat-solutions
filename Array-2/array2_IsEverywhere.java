class array2_IsEverywhere {
    public static void main(String[] args) {
        int[] array =  {1, 2, 3, 4, 4, 5};
        System.out.println(isEverywhere(array, 1));
    }
    
   public static boolean isEverywhere(int[] nums, int val) {
      int arrayLength = nums.length;
    
        
        for(int i  =  0 ; i <  arrayLength  - 1; i++)
        {
            if((nums[i] !=  val && nums[i+1] !=  val))
               return false;
        }
      
      return true;
   
    }   
}