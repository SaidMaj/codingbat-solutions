public class logic1_GreenTickett{
  public static void main(String args[]) {
    int x=2;
    int y=2;
    int f=2;

    System.out.println(greenTicket(x, y, f));
   }
  
  public static int greenTicket(int a, int b, int c) {
    if(a != b && b != c && a != c)
      return 0;
      
    if(a == b && b == c)  
      return 20;
        
      return 10;
    }
}