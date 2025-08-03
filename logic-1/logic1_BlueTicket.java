public class logic1_BlueTicket{
  public static void main(String args[]) {
      int x=2;
      int y=2;
      int f=2;

      System.out.println(blueTicket(x, y, f));
   }
  
   public static int blueTicket(int a, int b, int c) {
      int abPair = a + b;
      int bcPair = b + c;
      int acPair = a + c;
      
      if(abPair == 10 || bcPair == 10 || acPair == 10)
        return 10 ;
      
      if((abPair - bcPair) >= 10 ||  (abPair - acPair) >= 10 )
        return 5 ;
        
       return 0;
   }
}