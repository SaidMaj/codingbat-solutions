public class logic1_InOrderEqual {
  public static void main(String args[]) {
    int x=10;
    int y=25;
    int z=x+y;

    System.out.println(inOrderEqual(x, y, z, true));
  }
  
  public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    // return true if they are in strict increasing order, such as 2 5 11
    // with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.

      if( (a < b) && (b < c) || equalOk & (a <= b) && (b <= c)  )
        return true;
      
   return false;      
  }
}