class logic2_MakeChocolate {
    public static void main(String[] args) {
        System.out.println(makeChocolate(2, 1, 7));
    }
    public static int makeChocolate(int small, int big, int goal)
    {
      int result = goal; 
      
      
      if(small + (big * 5) < goal || small < goal % 5)
        return -1;
      
      for(int i = 0 ; i < big ; i++)
      {
        if(result >= 5)
        {
          result -= 5;
        }
        else
        {
          break;
        }
      }
        
      
      return result;  
    }

}