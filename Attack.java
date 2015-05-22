import java.util.*;

public class Attack {
   String nameAtt;
   int damageOf;

   
   public Attack(String nameAtt, int damageOf) {
      this.nameAtt = nameAtt;
      this.damageOf = damageOf;
   }
   
   public int useAttack(int Hp, int Luck, String attackerName) {
      int chanceToCrit = Luck * 5;
      double critNumber = (Math.random() * 100);
      System.out.print(attackerName + " used " + nameAtt);
      if(chanceToCrit >= critNumber) {
         System.out.println(" for " + (damageOf * 2) + " damage! Critical hit!");
         Hp-= (damageOf * 2);
      } else {
         System.out.println(" for " + damageOf + " damage!");
         Hp-= damageOf;
      }
      return Hp;  
   }
   
   public String getAttackName() {
      return nameAtt;
   }
   
   
}