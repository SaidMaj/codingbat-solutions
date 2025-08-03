class array2_FizzBuzz{
    public static void main(String[] args) {
        String[] result = fizzBuzz(1, 10);
        for(String str : result)
        {
            System.out.println(str);
        }
    }
    
    
    public static String[] fizzBuzz(int start, int end) {
      
       String[] array = new String[end - start];
       int index = 0;
      
      for(int i = start ; i < end ; i++)
      {
        if(i % 3 == 0 && i % 5 == 0)
        {
           array[index] = "FizzBuzz";
        }
        
        else if(i % 3 == 0)
        {
           array[index] = "Fizz";
        }
        
        else if (i % 5 == 0)
        {
           array[index] = "Buzz";
        }
        else
        {
         array[index] = String.valueOf(i);
        }
        index++;
      }
      
      return array;
    }

}