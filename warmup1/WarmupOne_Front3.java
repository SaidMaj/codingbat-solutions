public class WarmupOne_Front3 {
    public static void main(String[] args) {
        System.out.println(front3("Ahmed"));
        System.out.println(front3("Ahm"));
        System.out.println(front3("Ah"));
        System.out.println(front3("A"));
        System.out.println(front3(""));
    }

    public static String front3(String str) {
     int length = 3 ; 
     String result = "";


     if (str.isEmpty())
     {
        return "";
     }
     
    if(str.length() <= 2)
    {
        length = str.length();
    }
     
  
    
    for(int i = 0 ; i < 3 ; i++)
    {
        result += str.substring(0, length);
    }
    
    return result;
}



}