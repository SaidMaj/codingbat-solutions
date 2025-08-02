class array2_FizzArray2 {
    public static void main(String[] args) {
        String[] result = fizzArray2(5);
        for(String number : result)
        {
            System.out.println(number);
        }
    }
    
    public static String[] fizzArray2(int n) {
      
          String[] array = new String[n];
          
          for(int i = 0 ; i < n ; i++)
          {
            array[i] = String.valueOf(i);
          }
          
          return array;
    }

}