public class Array1_MakeLast {
  public static void main(String args[]) {
    int[] array =  {2, 9};
    int[] result = makeLast(array);

    for(int number : result)
    {
        System.out.println(number);
    }

  }
  
  public static int[] makeLast(int[] nums) {
     int arrayLength = nums.length * 2;
     int[] newArray = new int[arrayLength];
     newArray[arrayLength-1] = nums[nums.length-1];
  
    return newArray;
   }


}