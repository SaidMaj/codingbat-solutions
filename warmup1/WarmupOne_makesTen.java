public class WarmupOne_makesTen {
    public static void main(String[] args) {
        System.out.println(makes10(1,9));
    }
    public static boolean makes10(int a, int b)
    {
        return (a == 10 || b == 10) || (a + b == 10) ;
    }

}
