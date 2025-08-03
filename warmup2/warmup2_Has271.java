class warmup2_Has271{
    public static void main(String[] args) {
        int[] arr = { 2 , 7 ,7 };
        System.out.println(has271(arr));
    }
    
    public static boolean has271(int[] arr) {
    
    
      for(int i = 0 ; i < arr.length - 2; i++)
      {
      
        if( (arr[i + 1] == arr[i] + 5 ) &&  ( arr[i] - arr[i+2] >= -1 &&  arr[i] - arr[i+2] <= 3)   )
          return  true;
      }
    
    
      return false;
    }
}
     