public class Array1_MakeMiddle{
  public static void main(String args[]) {
    int[] array =  {2, 2 , 9, 7};
    int[] result = makeMiddle(array) ;
    
    for(int number : result)
    {
        System.out.println(number);
    }
     
  }
  
    public int[] makeMiddle(int[] nums) {
  
      int halfArrayLength = (nums.length / 2) - 1;
      
      int[] result = {nums[halfArrayLength], nums[halfArrayLength +1 ]};
      
      return result;
    }

}