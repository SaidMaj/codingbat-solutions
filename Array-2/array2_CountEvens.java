class array2_CountEvens {
    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 2};
        System.out.println(countEvens(nums));
    }

    public static int countEvens(int[] nums) {
      int count = 0 ;
      
      for(int number : nums)
      {
        if(number % 2 == 0)
        {
          count++;
        }
      }
      
      return count;
    }
}