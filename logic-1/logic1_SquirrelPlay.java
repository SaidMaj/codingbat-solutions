public class logic1_SquirrelPlay {
  public static void main(String args[]) {
    System.out.println(squirrelPlay(70,false));
  }
  
  public static boolean squirrelPlay(int temp, boolean isSummer) {
     return (temp >= 60 && temp <= 90 && !isSummer) || (temp >= 60 && temp <= 100 && isSummer);  
  }
}