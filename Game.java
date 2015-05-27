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
         
      } else if (checker == 1) {
         //stat increase/decrease
         theChosenOne.updateFocus(-1);
      }
      
      // Battle test
      AttackOptions firstFight = new AttackOptions();
      Attack normalAttack = new Attack("Study", theChosenOne.getIntel());
      Attack specialAttack = new Attack("Summon Kelvin!", theChosenOne.getCharis());
      firstFight.addAttack(normalAttack);
      firstFight.addAttack(specialAttack);
      Boss rapBoss = new Boss(10, "The Rap God", 2,5);
      System.out.println(rapBoss.getName() + " has appeared! What do you do?");
      firstFight.displayAttackOptions();
      int theChosenAttack = console.nextInt();
      
      firstFight.attacks().get(theChosenAttack - 1).useAttackPlayer(theChosenOne,rapBoss);
      
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