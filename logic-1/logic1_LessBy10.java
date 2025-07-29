public class logic1_LessBy10 {
   public static void main(String args[]) {
     int x=10;
     int y=25;
     int z=x+y;

     System.out.println(lessBy10(x, y, z));
   }
  
    public static boolean lessBy10(int a, int b, int c) {

      if(Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10)
        return true;
    
      return false;
     }
}