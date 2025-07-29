public class logic1_In1To10 {
    public static void main(String args[]) {
        System.out.println(in1To10(9, false));
    }
  
   public static boolean in1To10(int n, boolean outsideMode) {
      return (n >= 1 && n <= 10) && !outsideMode ||  (n <= 1 || n >= 10) && outsideMode ;
   }

}