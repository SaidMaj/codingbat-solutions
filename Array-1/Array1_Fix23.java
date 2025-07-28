public class Array1_Fix23 {
  public static void main(String args[]) {
    int[] array =  {2, 2 ,9};
    int[] fixedArray =  fix23(array);
    
        for(int number : fixedArray)
       {
          System.out.println(number);
       }    

  }
  
    public static int[] fix23(int[] nums) {
      
        if(nums[0] == 2 && nums[1] == 3)
        {
          nums[1] = 0;
        }
        
        if(nums[1] == 2 && nums[2] == 3)
        {
          nums[2] = 0;
        }
        
        return nums;
    }

}