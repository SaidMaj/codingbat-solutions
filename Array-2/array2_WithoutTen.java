class array2_WithoutTen{
    public static void main(String[] args) {
        int[] array =  {11, 10, 10, 2};
        int[] result = withoutTen(array);
        for(int number : result)
        {
            System.out.println(number);
        }
    }
    
    
    public  static int[] withoutTen(int[] nums) {
      int arrayLength = nums.length;
      int[] result = new int[arrayLength];
      
      // this var is point to the first index to start adding value to the result array
      int index = 0;
      
      for(int number : nums)
      {
        if(number != 10)
        {
          result[index] = number;
          index++;
        }
      }
      
      return result;
    }


}
