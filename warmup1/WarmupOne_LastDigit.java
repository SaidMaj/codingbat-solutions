
public class WarmupOne_LastDigit{
  public static void main(String args[]) {
        System.out.println(lastDigit(1,5));
  }

public static boolean lastDigit(int a, int b) {
  int aLastDigit = a % 10;
  int bLastDigit = b % 10;
  
  return aLastDigit == bLastDigit;
}
}
