public class logic1_TwoAsOne {
  public static void main(String args[]) {
    int x=10;
    int y=25;
    int z=x+y;

    System.out.println(twoAsOne(x, y, z));
  }
  
  public static boolean twoAsOne(int a, int b, int c) {
    return (a + b) == c || (c + b) == a  || (c + a) == b ;
  }

}