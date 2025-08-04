class logic2_LoneSum{
    public static void main(String[] args) {
        System.out.println(loneSum(1, 2, 3));
    }
    
    public int loneSum(int a, int b, int c) {
      if(a != b & b != c && a != c)
        return a + b + c;
        
      if (b == c && a != c )
      {
        return a ;
      }
      
      if (a == c && b != c )
      {
        return b ;
      }
      
      if (a == b && c != a )
      {
        return c ;
      }
      
      return 0;
    }

}
