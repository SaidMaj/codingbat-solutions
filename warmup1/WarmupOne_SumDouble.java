public class WarmupOne_SumDouble {
    public static void main(String[] args) {
        System.out.println(sumDouble(1,1));
    }

   public static int  sumDouble(int a, int b) {
        int number = a == b? 1 : 0;
        return (a+b) * ((number) + 1)  ;
    }

}