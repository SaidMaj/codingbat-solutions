public class warmup2_StringYak
{
    public static void main(String[] args)
    {
        
      System.out.println(stringYak("yak123ya"));
      System.out.println(stringYak("012"));
     
    }
    

public static String stringYak(String str) {
  String result = "";
  int stringLength = str.length();
  
  if(stringLength < 3)
	return str;
  
  for(int i = 0 ; i < stringLength ; i++)
  {
     if( stringLength-2  >  i && (str.charAt(i) == 'y'  &&  str.charAt(i+1) == 'a' && str.charAt(i+2) == 'k'))
     {
	    i += 3;
     }
     
	if(i != stringLength)
	{
        result += str.charAt(i);
	}
  }
    
    return result;

}

}
