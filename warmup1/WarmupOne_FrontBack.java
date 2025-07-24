public class WarmupOne_FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("a"));
	System.out.println(frontBack("ab"));
        System.out.println(frontBack("art"));
    }

    public static String frontBack(String str) {
       
       String result = "";
       
       
       if(str.length() <= 1)
        return str;
       
       result += str.charAt(str.length()- 1);
       result += (str.substring(1, str.length()- 1));
       result += str.charAt(0);
    
       return result;
}


}