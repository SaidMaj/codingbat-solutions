public class logic1_RedTicket{
   public static void main(String args[]) {
     int x=2;
     int y=2;
     int f=2;

     System.out.println(redTicket(x, y, f));
   }
  
   public static int redTicket(int a, int b, int c) {
     if(a == 2 && b == 2 && c == 2)
         return 10;
      
     if(a == b && b == c )
         return 5;
      
     if(a != b && a != c )
         return 1;
      
       return 0;
    }
}