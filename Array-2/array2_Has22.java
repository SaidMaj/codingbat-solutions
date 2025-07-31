class array2_Has22 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        System.out.println(has22(nums));
    }

    public static boolean has22(int[] nums) {
     int arrayLength = nums.length;
     
     for(int i = 0 ; i < arrayLength - 1 ; i++)
     {
        if(nums[i] == 2 && nums[i + 1] == 2)
            return true;
     }
     
       return false;
    }

}