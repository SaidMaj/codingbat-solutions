class array2_Sum28 {
    public static void main(String[] args) {
        int[] array =  {1, 2, 3, 4, 4, 5};
        System.out.println(sum28(array));
    }
    public static boolean sum28(int[] nums) {
      int sumOfTwo = 0;
      
      for(int number : nums)
      {
        if(number == 2)
        {
          sumOfTwo += number;
        }
      }
      return sumOfTwo == 8;
    }

}