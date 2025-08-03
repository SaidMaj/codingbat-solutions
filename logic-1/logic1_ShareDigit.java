public class logic1_ShareDigit{
    public static void main(String args[]) {
        int x=2;
        int f=2;
    
        System.out.println(shareDigit(x, f));
    }
      
    public static boolean shareDigit(int a, int b) {
        int firstDightForA = a / 10; 
        int lastDightForA = a % 10; 
        int firstDightForB = b / 10; 
        int lastDightForB = b % 10; 
      
        return lastDightForA == lastDightForB || 
        firstDightForA == firstDightForB || 
        firstDightForA == lastDightForB||
        lastDightForA == firstDightForB;
    }
}