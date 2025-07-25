public class WarmupOne_IcyHot {
  public static void main(String args[]) {
        System.out.println(icyHot(5,4));
  }
  
public static boolean icyHot(int temp1, int temp2) {
  return (temp1 < 0 || temp2 < 0) &&
        (temp1 > 100 || temp2 > 100);
}

}