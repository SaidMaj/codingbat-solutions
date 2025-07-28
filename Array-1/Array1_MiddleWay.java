public class Array1_MiddleWay {
  public static void main(String args[]) {
    int[] array =  {2, 3, 4};
    int[] array1 = {1, 2, 4};
    int[] result = middleWay(array, array1);
    
    for(int number : result)
    {
        System.out.println(number);
    }
  }
  
  public static int[] middleWay(int[] a, int[] b) {
  int[] result = {a[1], b[1]};
  return result;
 }


}
