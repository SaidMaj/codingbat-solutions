public class WarmupOne_NearHundred {
    public static void main(String[] args) {
        System.out.println(nearHundred(100));
    }

    public static boolean  nearHundred(int n) {
        return n > 111 ? Math.abs(n-200) <= 10 : Math.abs(n-100) <= 10;
    }

}
