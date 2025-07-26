public class warmup2_StringX
{
    public static void main(String[] args)
    {
        System.out.println(stringX("xabxxxcdx"));
    }
    
 
public static String stringX(String str) {
    int stringLength = str.length();
      String result = "";
      
      if(stringLength < 3)
        return str;
      
      for(int i = 0 ; i < stringLength; i++)
      {
        if( (i == 0 || i == stringLength-1 ) || (str.charAt(i) != 'x'))
            result += str.charAt(i);
      }
      
    return  result; 
}


}