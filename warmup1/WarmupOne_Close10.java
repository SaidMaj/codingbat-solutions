public class WarmupOne_Close10{
  public static void main(String args[]) {
        System.out.println(close10(12, 45));
  }



public static int close10(int a, int b) {
  int theDifferenceBetweenAandTen = Math.abs(10 - a);
  int theDifferenceBetweenBandTen = Math.abs(10 - b);
  
  if(theDifferenceBetweenAandTen < theDifferenceBetweenBandTen)
  {
    return a;
  }
  
  if(theDifferenceBetweenAandTen > theDifferenceBetweenBandTen)
  {
    return b;
  }
  
  return 0;
}



}