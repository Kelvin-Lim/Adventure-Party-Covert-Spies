public class Boss {
   int bossHp;
   String bossName;
   int bossLuck;
   int[] bossStats;
   
   public Boss(int bossHp, String Name, int bossLuck) {
      this.bossHp = bossHp;
      this.bossName = Name;
      this.bossLuck = bossLuck;
      bossStats = new int[]{ bossHp, 0};
      
   }
 public String getName() {
      return bossName;
   
   }
  
   public int getHp() {
      return bossStats[0];
   }
   
   public int getLuck() {
      return bossStats[1];
   }
}
