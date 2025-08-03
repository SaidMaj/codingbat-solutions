public class Array1_PlusTwo {
  public static void main(String args[]) {
    int[] array =  {2, 9};
    int[] array1 =  {1, 3};
    int[] result = plusTwo(array, array1);

    for(int number : result)
    {
        System.out.println(number);
    }

  }
  
   public static int[] plusTwo(int[] a, int[] b) {
    int[] result = { a[0] , a[1], b[0], b[1]};
    return result;
  }

}