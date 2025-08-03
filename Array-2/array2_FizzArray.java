class array2_FizzArray {
    public static void main(String[] args) {
        int[] result = fizzArray(5);
        for(int number : result)
        {
            System.out.println(number);
        }
    }
    
    public static int[] fizzArray(int n) {
      int[] array = new int[n];
      
      for(int i = 0 ; i < n ; i++)
      {
          array[i] = i;  
      }
      
      return array;
    }


}