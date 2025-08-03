public class Array1_MaxTriple{
  public static void main(String args[]) {
        int[] array =  {2, 2 ,7 , 9, 7};
        System.out.println(maxTriple(array));
         
    }
  
     public static int maxTriple(int[] nums) {
      int ArrayLength = nums.length ;
      
      int firstValue = nums[0];
      int middleValue = nums[(nums.length/2)];
      int lastValue = nums[(nums.length)-1];
      
      return Math.max(firstValue, Math.max(middleValue, lastValue) );
    }
}
