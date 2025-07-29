public class Array1_CigarParty {
  public static void main(String args[]) {
    System.out.println(cigarParty(30, false));
  }
  
  public static boolean cigarParty(int cigars, boolean isWeekend) {
    return cigars >= 40 && isWeekend || (cigars >= 40 && cigars <=60 && !(isWeekend));
  }

}