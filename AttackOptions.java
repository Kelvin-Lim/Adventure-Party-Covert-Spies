import java.util.*;

public class AttackOptions {
   private ArrayList<Attack> attackOptions = new ArrayList<Attack>();
   public AttackOptions() {
   }
   
   public void addAttack(Attack newAttack) {
      attackOptions.add(newAttack);
   }
   
   public void displayAttackOptions() {
      for (int attackNum = 0; attackNum < attackOptions.size(); attackNum++) {
         System.out.println("Option " + (attackNum + 1) + "): " + attackOptions.get(attackNum).getAttackName());
      } 
   }
   
   public ArrayList<Attack> attacks() {
      return attackOptions;
   }
}