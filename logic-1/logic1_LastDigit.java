public class logic1_LastDigit {
  public static void main(String args[]) {
    int x=10;
    int y=25;
    int z=x+y;

    System.out.println(lastDigit(x, y, z));
  }
  
  public static boolean lastDigit(int a, int b, int c) {
    // return true if two or more of them have the same rightmost digit.
    int rightMostOfFirstNumber = a % 10;
    int rightMostOfSecondNumber = b % 10;
    int rightMostOfThirdNumber = c % 10;
      
      return rightMostOfFirstNumber == rightMostOfSecondNumber || rightMostOfSecondNumber == rightMostOfThirdNumber          	|| rightMostOfThirdNumber == rightMostOfFirstNumber; 
  }

}