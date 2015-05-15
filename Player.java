public class Player {
   private String playerName;
   private int playerAge;
   private int playerGrade;
   private int[] playerStats;
   
   public Player (String name, int age, int grade) {
      playerName = name;
      playerAge = age;
      playerGrade = grade; 
      playerStats = new int[]{playerGrade * 10,0,0,0,0};
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
   
   public void setHp(int Hp) {
      playerStats[0] = Hp;
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
}