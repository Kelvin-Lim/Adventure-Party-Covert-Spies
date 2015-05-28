public class Boss {
   int bossHp;
   String bossName;
   int bossLuck;
   int bossFocus;
   int[] bossStats;
   
   public Boss(int bossHp, String Name, int bossLuck, int bossFocus) {
      this.bossHp = bossHp;
      this.bossName = Name;
      this.bossLuck = bossLuck;
      bossStats = new int[]{ bossHp, bossLuck, bossFocus};
      
   }
 public String getName() {
      return bossName;
   }
  
   public int getHp() {
      return bossStats[0];
   }
   
   public void updateHp(int update) {
      bossStats[0] -= update;
   }
   
   public int getLuck() {
      return bossStats[1];
   }
   
   public int getFocus() {
      return bossStats[2];
   }
   
   public void updateFocus(int update) {
      bossStats[2]+= update;
   }
}
