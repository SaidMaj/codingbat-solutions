public class Array1_Start1 {
  public static void main(String args[]) {
    int[] array =  {2, 2 ,9};
    int[] array2 =  {2, 1 ,3};
    
     System.out.println(start1(array, array2)) ;
  }
  
   public static int start1(int[] a, int[] b) {
      int firstArrayLength = a.length;
      int secondArrayLength = b.length;
    
      if((firstArrayLength >= 1 &&  secondArrayLength >= 1))
      {
         if(a[0] == 1 && b[0] == 1)
         {
             return 2;    
         }
         if(a[0] == 1 || b[0] == 1)
         {
             return 1;    
         }
      }
      
      if(firstArrayLength == 0 || secondArrayLength == 0 )
      {
         if(firstArrayLength >= 1 && secondArrayLength == 0 &&a[0] == 1 )
             return 1;    
         if(secondArrayLength >= 1 && firstArrayLength == 0 &&b[0] == 1 )
             return 1;    
      }
      
    return 0;
  }

}
