class array2_Only14 {
    public static void main(String[] args) {
        int[] array =  {1, 2, 3, 4, 4, 5};
        System.out.println(only14(array));
 
    }
    
    public static boolean only14(int[] nums) {
      
      for(int i = 0 ; i < nums.length ; i++)
      {
          if(!(nums[i] == 1  || nums[i] == 4 ))
             return false;
      }
      
      return true;
    }
}