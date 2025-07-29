public class Array1_Make2 {
  public static void main(String[] args) {
    int[] array = { 9, 10 };
    int[] array2 = { 9, 10, 1 };
    int[] result = make2(array, array2);

    for (int number : result) {
      System.out.println(number);
    }

  }

 public static int[] make2(int[] a, int[] b) {
      int firstArrayLength = a.length;
      int secondArrayLength = b.length;
      int[] result = new int[2];
  
      if((firstArrayLength > 1 && secondArrayLength >=1) && (firstArrayLength > secondArrayLength || secondArrayLength > firstArrayLength) )
      {
        result[0] = a[0];    
        result[1] = a[1];
        return result;
      }
      
      if(firstArrayLength == 1 && secondArrayLength >=1)
      {
        result[0] = a[0];    
        result[1] = b[0];
        return result;
      }
      
      if(firstArrayLength == 0 && secondArrayLength >=1)
      {
        result[0] = b[0];    
        result[1] = b[1];
        return result;
      }
      
      if(firstArrayLength >=1 && secondArrayLength  == 0)
      {
        result[0] = a[0];    
        result[1] = a[1];
        return result;
      }
      
      return a;
  }

}