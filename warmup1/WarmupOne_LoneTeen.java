public class WarmupOne_LoneTeen {
  public static void main(String args[]) {
        System.out.println(loneTeen(5,3));
  }

/*
    I have used the !  "Not" unray opreator to handle if both a's and b's are in the range 13 - 19
    !(true and true) - > !(true) - > false

*/

public static boolean loneTeen(int a, int b) {
  return !((a > 12 && a < 20) && (b > 12 && b < 20) ) && a != b;
}


}