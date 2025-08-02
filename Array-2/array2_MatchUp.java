class array2_MatchUp {
    public static void main(String[] args) {
        int[] array =  {1, 2, 3, 4, 4, 5};
        int[] array1 =  {1, 2, 3, 4, 4, 5};
        System.out.println(matchUp(array, array1));
    }
    
    public static int matchUp(int[] nums1, int[] nums2) {
      int count = 0;
      int difference = 0;
      
      for(int i = 0 ; i < nums1.length ; i++ )
      {
          difference = Math.max(nums1[i], nums2[i]) - Math.min(nums1[i] , nums2[i]);
          
          if(difference == 1 || difference == 2)
          {
            count++;
          }
      }
      
      return  count;
    }

}