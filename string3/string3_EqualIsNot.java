class string3_EqualIsNot{
    public static void main(String[] args) {
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }
    
    public static boolean equalIsNot(String str) {
      
          int countIs = 0;
          int countNot = 0;
          
          for(int i  = 0 ; i < str.length() - 1 ; i++)
          {
             if(( i  < str.length() -2 ) && str.substring(i, i + 3).equals("not"))
             {
                 countNot++;
             }
             
             if(str.substring(i, i + 2).equals("is"))
             {
                 countIs++;
             }
             
             
          }
             
          return countIs == countNot;
    
    }

}