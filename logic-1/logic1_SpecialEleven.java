public class logic1_SpecialEleven {
    public static void main(String args[]) {
        System.out.println(specialEleven(11));
    }
  
   public static boolean specialEleven(int n) {
      return n >= 0  && ((n % 11 == 0) || (((n - 1) % 11) == 0));
    }

}