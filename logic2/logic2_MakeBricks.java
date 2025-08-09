class logic2_MakeBricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
    }
    public static boolean makeBricks(int small, int big, int goal) {
  
      int requriedOne = goal %  5;
      int requriedFive = (int)Math.ceil((goal - small) / 5);
     
      if((small + (big * 5) ) <  goal)
        return false;
     
      return requriedFive <= big && requriedOne <= small ;
    }

}