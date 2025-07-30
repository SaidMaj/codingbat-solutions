public class string2_CatDog {
    public static void main(String args[]) {
       
        System.out.println(catDog("Said"));
    }
  
    public static boolean catDog(String str) {
        int countCats = 0;
        int countDogs = 0;
      
        for(int i = 0 ; i < str.length() - 2; i++)
        {
           if(str.substring(i,i+3).equals("cat"))
           {
             countCats++;
           }
        
           if(str.substring(i,i+3).equals("dog"))
           {
             countDogs++;
           }

        }
        return countCats == countDogs;
    }
}