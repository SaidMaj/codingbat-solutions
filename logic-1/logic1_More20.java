public class logic1_More20 {
    public static void main(String args[]) {
        System.out.println(more20(11));
    }
  
   public static boolean more20(int n) {
     return n >= 0 && ((n % 20 == 1) || (n % 20 == 2));
   }

}