public class Array1_FrontPiece {
  public static void main(String[] args) {
    int[] array = { 9, 10, 1 };
    int[] result = frontPiece(array);

    for (int number : result) {
      System.out.println(number);
    }
  }

  public static int[] frontPiece(int[] nums) {
    int arrayLength = nums.length;

    if (arrayLength <= 2)
      return nums;

    int[] result = { nums[0], nums[1] };

    return result;
  }

}