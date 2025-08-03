public class logic1_CaughtSpeeding {
    public static void main(String args[]) {
        System.out.println(caughtSpeeding(70,false));
    }
  
    public static int caughtSpeeding(int speed, boolean isBirthday) {
      // 0=no ticket, 1=small ticket, 2=big ticke
      
      if(speed <= 60 || isBirthday  && speed <= 65)
      {
        return 0;
      }
      if(speed >= 61 && speed <= 80 || isBirthday  && speed <= 85)
      {
        return 1;
      }
      if(speed >= 81 || isBirthday  && speed <= 86 )
      {
        return 2;
      }
      
      return 0;
    }
}