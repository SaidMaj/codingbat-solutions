public class WarmupOne_HasTeen {
  public static void main(String args[]) {
        System.out.println(hasTeen(5,4,3));
  }
  
public static boolean hasTeen(int a, int b, int c) {
  return (a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20);
}



}