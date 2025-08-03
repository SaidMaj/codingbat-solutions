public class logic1_TeenSum {
  public static void main(String args[]) {
    System.out.println(teenSum(3, 3));
  }
  
  public static int teenSum(int a, int b) {
      int sum = a + b;
      return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) ? 19 : sum;
  }

}