import java.util.*;
import java.awt.*;

public class Game {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      intro();
      System.out.println("What is your name? (Is this pokemon?)");
      String theChosenOnesName = console.next();
      //System.out.println(theChosenOnesName);
      System.out.println("How old are you?");
      int theChosenOnesAge = console.nextInt();
      System.out.println("What grade level are you?");
      int theChosenOnesGrade = console.nextInt();
      Player theChosenOne = new Player(theChosenOnesName, theChosenOnesAge, theChosenOnesGrade);
     
     
     
      /*
      Attack useCode = new Attack("useCode",10);
      
      theChosenOne.setHp(useCode.useAttack(theChosenOne.getHp(),4,"RapBoss"));
      System.out.println(theChosenOne.getHp());
      theChosenOne.setHp(useCode.useAttack(theChosenOne.getHp(),4,"RapBoss"));
      System.out.println(theChosenOne.getHp());
      theChosenOne.setHp(useCode.useAttack(theChosenOne.getHp(),4,"RapBoss"));
      System.out.println(theChosenOne.getHp());
      theChosenOne.setHp(useCode.useAttack(theChosenOne.getHp(),4,"RapBoss"));
      System.out.println(theChosenOne.getHp());
      */
      //System.out.println("Focus: "+theChosenOne.getFocus());
      
      Decision subDay = new Decision("You have a sub in class!" , 2);
      int checker = 0;
      subDay.setDecisions("Study.");
      subDay.setDecisions("Play Halo.");
      System.out.println(subDay.displayEvent());
      subDay.displayChoices();
      String theChosenOnesChoice = console.next();
      for(int i = 0; i < subDay.decisions().length; i++) {
         if (theChosenOnesChoice.substring(0 , 1).equalsIgnoreCase(subDay.decisions()[i].substring(0 , 1))) {
            //System.out.println("Hi");
            checker = i;
         }
      }
      System.out.println(checker);
      if (checker == 0) {
         //stat increase/decrease
         theChosenOne.updateIntel(1);
         
      } 
      else if (checker == 1) {
         //stat increase/decrease
         theChosenOne.updateFocus(-1);
         theChosenOne.updateCharis(1);
      }
      
      // Battle test
      AttackOptions firstFight = new AttackOptions();
      AttackOptions bossFight = new AttackOptions();  
      Attack normalAttack = new Attack("Study", 5);
      Attack specialAttack = new Attack("Summon Kelvin!", theChosenOne.getCharis());
      Attack bossAttack1 = new Attack("Kanye West Ego.", 5);
      Attack bossAttack2 = new Attack("Lil B's Curse.", 8);
      Attack bossAttack3 = new Attack("Spit Fire.", 10);
      Attack bossAttack4 = new Attack("Mom's Spaghetti.", 15);
      Attack bossAttack5 = new Attack("Deadline!!!!!", 99999);
      firstFight.addAttack(normalAttack);
      firstFight.addAttack(specialAttack);
      bossFight.addAttack(bossAttack1);
      bossFight.addAttack(bossAttack2);
      bossFight.addAttack(bossAttack3);
      bossFight.addAttack(bossAttack4);
      Boss rapBoss = new Boss(150, "The Rap God", 2,5);
      System.out.println(rapBoss.getName() + " has appeared! What do you do?");
      int deadline = 0;
      while (rapBoss.getHp() > 0 && theChosenOne.getHp() > 0) {
         firstFight.displayAttackOptions();
         int theChosenAttack = console.nextInt();
         firstFight.attacks().get(theChosenAttack - 1).useAttackPlayer(theChosenOne,rapBoss);
         double randomAttack = (Math.random() * 100);
         if(rapBoss.getHp() > 0) {
            if(randomAttack < 25) {
               bossFight.attacks().get(0).useAttackBoss(theChosenOne,rapBoss);
            } 
            else if(randomAttack >= 25 || randomAttack < 50) {
               bossFight.attacks().get(1).useAttackBoss(theChosenOne,rapBoss);
            } 
            else if(randomAttack >= 50 || randomAttack < 75) {
               bossFight.attacks().get(2).useAttackBoss(theChosenOne,rapBoss);
            } 
            else {
               bossFight.attacks().get(3).useAttackBoss(theChosenOne,rapBoss);
            }
            if (deadline >= 7) {
               System.out.println("Deadline Approaches! " + (10 - deadline) + " Days Remaining!");
            }
            if (deadline >= 10) {
               rapBoss.updateFocus(1000);
               bossFight.addAttack(bossAttack5);
               bossFight.attacks().get(4).useAttackBoss(theChosenOne,rapBoss);
            }
            deadline++;
         }
         
      }
      if (theChosenOne.getHp() > 0) {
         System.out.println("You have defeated the boss! Your grade will be increased");
      } else {
         System.out.println("You have failed! GAME OVER.");
      }
      deadline = 0;
      /*
      System.out.println(theChosenOne.getName());
      System.out.println(theChosenOne.getAge());
      System.out.println(theChosenOne.getGrade());
      System.out.println(theChosenOne.getHp());
      System.out.println(theChosenOne.getIntel());
      System.out.println("Focus: " + theChosenOne.getFocus());
      System.out.println(theChosenOne.getCharis());
      System.out.println(theChosenOne.getLuck());
      */
      
   }
   public static void intro() {
      System.out.println("Welcome to the Adventure Party of Covert Spies!");
      System.out.println("APCS for short!");
      System.out.println("We are glad to have you as a new student in our class!");
   
      
   }
}