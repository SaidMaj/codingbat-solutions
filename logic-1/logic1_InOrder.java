
public class logic1_InOrder {
  public static void main(String args[]) {
    int x=10;
    int y=25;
    int z=x+y;

    System.out.println(inOrder(x, y, z, true));
  }
  
  public static boolean inOrder(int a, int b, int c, boolean bOk) {
      // return true if b is greater than a, and c is greater than b
      // with the exception that if "bOk" is true
      
     if(bOk && c > b || (b > a) && (c > b) )
        return true;
      
     return false;
  }
}