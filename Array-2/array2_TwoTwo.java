class array2_TwoTwo{
    public static void main(String[] args) {
        int[] array =  {4, 2, 2, 3};
        System.out.println(twoTwo(array));
    }
    
    
    public static boolean twoTwo(int[] arr) {
      int arrayLength = arr.length; 
      boolean result = true;
      
      if( arrayLength == 1 && arr[0] == 2 )
      {
        return false;
      }
      
      for(int i = 0; i < arrayLength - 1 ;)
      {
        if(arr[i] == 2 && arr[i+1] == 2)
        {
           i+=2;
           result = true;
           continue;
        }
        else if(arr[i] == 2 && arr[i+1] != 2 || (i + 1 == arrayLength - 1) && arr[i] != 2 && arr[i+1] == 2)
        {
          return false;
        }
        i++;
      }
      
      return result;
    
    }

}
   