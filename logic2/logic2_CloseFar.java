class logic2_CloseFar{
    public static void main(String[] args) {
        System.out.println(closeFar(1, 2, 3));
    }
    
    public static boolean closeFar(int a, int b, int c) {
      if( !(Math.abs(a - c) <= 1 &&  Math.abs(a - b) <= 1)  && Math.abs(c - b) >= 2)
      {
        return true;
      }
      return false;
    }

}
