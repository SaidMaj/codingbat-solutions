class array2_CenteredAverage {
    public static void main(String[] args) {
        int[] nums = {10, 3, 5, 6};
        System.out.println(centeredAverage(nums));
    }

    public int centeredAverage(int[] nums) {
      int arrayLength = nums.length;
      int count  = arrayLength - 2;
      int sum = 0;
      
      Arrays.sort(nums);
      
      for(int i = 1 ; i < arrayLength - 1 ; i++)
      {
        sum += nums[i];
      }
      
      return sum / count;
    }
}