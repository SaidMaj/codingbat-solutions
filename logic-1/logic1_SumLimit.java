public class logic1_SumLimit{
    public static void main(String args[]) {
        int x=2;
        int f=2;
    
        System.out.println(sumLimit(x, f));
     }
      
    public static int sumLimit(int a, int b) {
        int lengthOfA = String.valueOf(a).length();
        int sum = a + b; 
        int Result = String.valueOf(sum).length();
      
        if( lengthOfA == Result)
          return sum;
 
        return a;
    }
}