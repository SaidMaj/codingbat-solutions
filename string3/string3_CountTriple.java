class string3_CountTriple{
    public static void main(String[] args) {
        System.out.println(countTriple("abcXXXabc"));
    }
    
    public static int countTriple(String str) {
      int count = 0 ;
      
      str = str.toLowerCase();
      
      for(int i = 0 ; i < str.length() -2 ; i++)
      {
        if(str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2))
        {
          count++;
        }
      }
      
      return count;
    }

}