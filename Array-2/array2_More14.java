class array2_More14 {
    public static void main(String[] args) {
        int[] array =  {1, 2, 3, 4, 4, 5};
        System.out.println(more14(array));
    }
    public static boolean more14(int[] nums) {
      int countOnes = 0;
      int countFours = 0;
      
      for(int number : nums)
      {
        if(number == 1)
        {
          countOnes++;
        }
        if(number == 4)
        {
          countFours++;
        }
      }
      return  countOnes > countFours ;
    }

}