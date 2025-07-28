public class Array1_CommonEnd {
  public static void main(String args[]) {
    int[] nums = {1, 2, 3, 4};
    int[] nums2 = {1, 2, 3, 4} ;
    System.out.println(commonEnd(nums, nums2));
  }
 
  public static boolean commonEnd(int[] a, int[] b) {
  
    int firstArrayLength = a.length;
    int secondArrayLength = b.length;
  
    return (a[firstArrayLength - 1] == b[secondArrayLength - 1]) || a[0] == b[0];  
  }

}
