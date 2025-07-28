public class Array1_MidThree{
  public static void main(String args[]) {
        int[] array =  {2, 2 ,7 , 9, 7};
        int[] result = midThree(array) ;
    
        for(int number : result)
        {
            System.out.println(number);
        }
         
    }
  
      public static int[] midThree(int[] nums) 
     {
      int arrayLength = (nums.length /2) - 1  ;
      int[] result = {nums[arrayLength] ,  nums[arrayLength + 1] , nums[arrayLength + 2] };
      return result;
    }
}