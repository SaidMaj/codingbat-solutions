public class logic1_AnswerCell {
  public static void main(String args[]) {
    System.out.println(answerCell(false, false,true));
  }
  
  public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
     //if not morining and not his mon and sleeping return true
     //if is isMo and his mam is calling isMom and he awake return true
     
     if((!isMorning && !isMorning && !isAsleep) || (isMorning && isMom && !isAsleep) )
      return true;
      
      return false;
    }
}