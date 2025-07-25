public class WarmupOne_IntMax {
  public static void main(String args[]) {
        System.out.println(intMax(12, 45, 44));
  }



public static int intMax(int a, int b, int c) {
  int max = Math.max(a,b);
  return Math.max(max, c);
}



}