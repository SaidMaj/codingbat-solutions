public class logic1_AlarmClock {
    public static void main(String args[]) {
        System.out.println(alarmClock(0, true));
    }
  
   public static String alarmClock(int day, boolean vacation) {

        if(day >= 1 && day <=5 &&  !vacation)
          return "7:00";
        
        if(day >= 1 && day <=5 &&  vacation || (day == 6 || day == 0) &&  !vacation )
          return "10:00";

        return "off";   
    }

}s