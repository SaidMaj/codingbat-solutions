public class logic1_WithoutDoubles{
  public static void main(String args[]) {
    int x=2;
    int y=2;

    System.out.println(withoutDoubles(x, y, true));
   }
  
  public static int withoutDoubles(int die1, int die2, boolean noDoubles) {

      if((die1 == die2) && noDoubles)
      {
        if(die1 == 6)
         {
           die1 = 1;
         }
         else
         {
           die1++;
         }
      }    
      return die1 + die2;
  }
}