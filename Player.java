public class Player {
   private String playerName;
   private int playerAge;
   private int playerGrade;
   private int[] playerStats;
   int maxHp;
   
   public Player (String name, int age, int grade) {
      playerName = name;
      playerAge = age;
      playerGrade = grade;
      if(grade == 12){ 
         playerStats = new int[]{playerGrade * 10,7,3,6,4};
         //spot 0 = HP, spot 1 = intel, spot 2 = focus, spot 3 = charis, spot 4 = luck
      } else if(grade == 11) {
         playerStats = new int[]{playerGrade * 10,6,8,4,2};
      } else if(grade == 10) {
         playerStats = new int[]{playerGrade * 10,5,7,3,5};
      } else {
         playerStats = new int[]{playerGrade * 10,2,5,1,9};
      }
      maxHp = playerGrade*10;
   }
   
   public String getName() {
      return playerName;
   }
   
   public int getAge() {
      return playerAge;
   }
   
   public int getGrade() {
      return playerGrade;
   }
   
   public int getHp() {
      return playerStats[0];
   }
   
   public void updateHp(int update) {
      playerStats[0] -= update;
   }
   
   public int getIntel() {
      return playerStats[1];
   }
   
   public int getFocus() {
      return playerStats[2];
   }
   
   public int getCharis() {
      return playerStats[3];
   }
   
   public int getLuck() {
      return playerStats[4];
   }
   
   public void updateIntel(int update) {
      playerStats[1] += update;
   }
   
   public void updateFocus(int update) {
      playerStats[2] += update;
   }
   
   public void updateCharis(int update) {
      playerStats[3] += update;
   }
   
   public void updateLuck(int update) {
      playerStats[4] += update;
   }
   
   public void setHp(int update) {
      playerStats[0] += update;
      maxHp += update;
   }
   
   public void healHp(int update) {
      playerStats[0] = maxHp;
   }
}