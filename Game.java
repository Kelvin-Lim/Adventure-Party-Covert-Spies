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
     
     
     
      Attack useCode = new Attack("useCode",10);
      
      theChosenOne.setHp(useCode.useAttack(theChosenOne.getHp(),4,"RapBoss"));
      System.out.println(theChosenOne.getHp());
      theChosenOne.setHp(useCode.useAttack(theChosenOne.getHp(),4,"RapBoss"));
      System.out.println(theChosenOne.getHp());
      theChosenOne.setHp(useCode.useAttack(theChosenOne.getHp(),4,"RapBoss"));
      System.out.println(theChosenOne.getHp());
      theChosenOne.setHp(useCode.useAttack(theChosenOne.getHp(),4,"RapBoss"));
      System.out.println(theChosenOne.getHp());
      
      Decision subDay = new Decision("You have a sub in class!" , 2);
      subDay.setDecisions("Study.");
      subDay.setDecisions("Play Halo.");
      System.out.println(subDay.displayEvent());
      subDay.displayChoices();
      String theChosenOnesChoice = console.next();
      for(int i = 0; i < subDay.decisions().length; i++) {
         if (theChosenOnesChoice.substring(0 , 1).equalsIgnoreCase(subDay.decisions()[i].substring(0 , 1))) {
            System.out.println("Hi");
         }
      }
      
      /*
      System.out.println(theChosenOne.getName());
      System.out.println(theChosenOne.getAge());
      System.out.println(theChosenOne.getGrade());
      System.out.println(theChosenOne.getHp());
      System.out.println(theChosenOne.getIntel());
      System.out.println(theChosenOne.getFocus());
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