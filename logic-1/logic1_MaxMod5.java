public class logic1_MaxMod5{
    public static void main(String args[]) {
     int x=2;
     int y=2;

     System.out.println(maxMod5(x, y));
   }
  
    public static int maxMod5(int a, int b) {
    
      if(a == b)
          return 0;
    
      if((a % 5) != (b % 5) )
        return Math.max(a,b);
       
       return  Math.min(a,b); 
    }
}