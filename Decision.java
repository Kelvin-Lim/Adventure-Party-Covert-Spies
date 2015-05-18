public class Decision {
   private String event;
   private String[] decisions;
   private int x = 0;
   private int numOfDec;
   
   public Decision (String event, int numOfDec) {
      this.event = event + " What do you do?";
      decisions = new String[numOfDec];
      this.numOfDec = numOfDec;
   }
   
   public void setDecisions(String choice) {
      decisions[x] = choice;
      x++;
   }
   
   public String displayEvent() {
      return event;
   }
   
   public String[] decisions() {
      return decisions;
   }
   
   public void displayChoices() {
      for(int i = 0; i < numOfDec; i++) {
         System.out.println(decisions[i]);
      }
   }
}