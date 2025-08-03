class array2_FizzArray3{
    public static void main(String[] args) {
        int[] result = fizzArray3(5, 10);
        for(int number : result)
        {
            System.out.println(number);
        }
    }
    
    
    public static int[] fizzArray3(int start, int end) {
      int arrayLength = end - start;
      int[] fizzArray = new int[arrayLength];
      int index = 0;
      
      for(int i = start ; i < end ; i++)
      {
         fizzArray[index] = i;
         index++;
      }
      
      return fizzArray;
    }


}