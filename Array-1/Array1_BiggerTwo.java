public class Array1_BiggerTwo {
  public static void main(String args[]) {
    int[] array =  {2, 2 ,9};
    int[] array2 =  {2, 1 ,3};
    
    for(int number : biggerTwo(array, array2))
    {
        System.out.println(number);
    }
     
  }
  
  public static int[] biggerTwo(int[] a, int[] b) {
      if(a[0] + a[1] >= b[0] + b[1])
          return a;
          
      return b;
  }

}