import java.util.*;

public class Attack {
   String nameAtt;
   int damageOf;

   
   public Attack(String nameAtt, int damageOf) {
      this.nameAtt = nameAtt;
      this.damageOf = damageOf;
   }
   
   public void useAttackPlayer(Player player, Boss boss) {
      int strength = damageOf * player.getIntel();
      int chanceToCrit = player.getLuck() * 5;
      int accuracy = player.getFocus() * 10;
      double accurNumber = (Math.random() * 100);
      double critNumber = (Math.random() * 100);
      System.out.print(player.getName() + " used " + nameAtt);
      if(accuracy >= accurNumber) { 
         if(chanceToCrit >= critNumber) {
            System.out.println(" for " + (strength * 2) + " damage! Critical hit!");
            boss.updateHp(strength * 2);
            System.out.println(boss.getName() + " has " + boss.getHp() + "HP remaining!");
         } else {
            System.out.println(" for " + strength + " damage!");
            boss.updateHp(strength);
            System.out.println(boss.getName() + " has " + boss.getHp() + "HP remaining!");
         }
      } else { 
         System.out.println("Oh No! Your attack missed.");
         System.out.println(boss.getName() + " has " + boss.getHp() + "HP remaining!");
      }
   }
   
   public void useAttackBoss(Player player, Boss boss) {
      int strength = damageOf;
      int chanceToCrit = boss.getLuck() * 5;
      int accuracy = boss.getFocus() * 10;
      double accurNumber = (Math.random() * 100);
      double critNumber = (Math.random() * 100);
      System.out.print(boss.getName() + " used " + nameAtt);
      if(accuracy >= accurNumber) {
         if(chanceToCrit >= critNumber) {
            System.out.println(" for " + (strength * 2) + " damage! Critical hit!");
            player.updateHp(strength * 2);
            System.out.println(player.getName() + " has " + player.getHp() + "HP remaining!");
         } else {
            System.out.println(" for " + strength + " damage!");
            player.updateHp(strength);
            System.out.println(player.getName() + " has " + player.getHp() + "HP remaining!");
         } 
      } else {
         System.out.println(" You got lucky! Bosses attack missed.");
         System.out.println(player.getName() + " has " + player.getHp() + "HP remaining!");
      }
   }
   
   public String getAttackName() {
      return nameAtt;
   }
   
   
}