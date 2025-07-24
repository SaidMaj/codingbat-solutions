public class WarmupOne_BackAround {
    public static void main(String[] args) {
        System.out.println(backAround("Mike"));
    }

    public static String backAround(String str)
    {
         /*
           To solve this problem I have used both charAt and length funcation
           I used charAt to able to acces the last character in the string 
           and used length to be able to know the string size
         */
          return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
    }


}