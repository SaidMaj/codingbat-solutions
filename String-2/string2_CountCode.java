public class string2_CountCode {
    public static void main(String args[]) {

        System.out.println(countCode("Said"));
    }
    
    public static int countCode(String str) {
        int countString = 0;
        
        /*
            here if any string begins with co and ends with e will be considered true
            codexxcode
            0123456789
            
            first of all the substring(0,2) equals to "co" now checkint the second condtion
            substring(3,4) which is "s" countString will be incremtnt by one and so on
            
       */
        
        for(int i = 0 ; i < str.length() - 3; i++)
        {
            if(str.substring(i,i+2).equals("co") &&  str.substring(i+3, i+4).equals("e"))
            {
                countString++;
            }
        }
        return countString;
    }
}