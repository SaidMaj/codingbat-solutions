class array2_Sum67 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        System.out.println(sum67(nums));
    }

    public static int sum67(int[] nums) {
      int sum = 0;
      boolean add = true;
      
      for(int i = 0 ; i < nums.length ; i++)
      {
        if(nums[i]  ==  6)
        {
          add = false;
        }
        if(nums[i] == 7 && !add)
        {
          add = true;
          continue;
        }
        if(add)
        {
          sum += nums[i];
        }
      }
       return sum;
    }

}