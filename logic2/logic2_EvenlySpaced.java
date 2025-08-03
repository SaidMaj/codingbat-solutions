class logic2_EvenlySpaced{
    public static void main(String[] args) {
        System.out.println(evenlySpaced(1, 3, 3));
    }
    
    public static boolean evenlySpaced(int a, int b, int c) {
      int small = Math.min(a, Math.min(b, c));
      int large = Math.max(a, Math.max(b, c));
      int medium = a > small && a < large ?  a : b > small && b < large ? b : c; 
      
      
      return (medium - small) == (large - medium );
    }


}