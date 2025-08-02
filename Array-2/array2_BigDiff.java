class array2_BigDiff {
    public static void main(String[] args) {
        int[] nums = {10, 3, 5, 6};
        System.out.println(bigDiff(nums));
    }

    public static int bigDiff(int[] nums) {
      int smallestValues = nums[0];
      int largestValues = nums[0];
      
      for(int number : nums)
      {
        smallestValues = Math.min(smallestValues, number);
        largestValues = Math.max(largestValues, number);
      }
      
      return largestValues - smallestValues;
    }

}