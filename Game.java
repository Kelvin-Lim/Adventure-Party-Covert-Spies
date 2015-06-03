import java.util.*;
import java.awt.*;

public class Game {
   public static void main(String[] args) {
   //BALANCE THE GAME
      Scanner console = new Scanner(System.in);
      intro();
      System.out.println("What is your name? (Is this pokemon?)");
      String theChosenOnesName = console.next();
      //System.out.println(theChosenOnesName);
      System.out.println("How old are you?");
      int theChosenOnesAge = console.nextInt();
      System.out.println("What grade level are you? (9 - 12)");
      int theChosenOnesGrade = 0;
      while(theChosenOnesGrade < 9 || theChosenOnesGrade > 12) {
         theChosenOnesGrade  = console.nextInt();
         try {
            if(theChosenOnesGrade < 9 || theChosenOnesGrade > 12) {
               throw new IllegalArgumentException("Grade must be between 9 and 12.");
            }
         }
         catch (IllegalArgumentException e) {
            System.err.println(e.getMessage() + " Please choose a new grade.");
         }
      }
      System.out.println();
      System.out.println("(When options are given, please make your choice using the number next to the choice.)");
      System.out.println();
      Player theChosenOne = new Player(theChosenOnesName, theChosenOnesAge, theChosenOnesGrade);
      System.out.println("Attention all students! Grading policies have changed this year!");
      System.out.println("Grades are now divided into five parts!");
      System.out.println("0% will result in your failure. 1 - 25% will be a D.");
      System.out.println("26 - 50% will be a C. 51 - 75% will be a B. And 76 - 100% will be an A.");
      System.out.println();
      
      //First day of class
      Decision newStudent = new Decision("Welcome to your first day." , 2);
      int newStudentChecker = 0;
      System.out.println(newStudent.displayEvent());
      newStudent.setDecisions("Sit with the cool kids in the corner by Ashley.");
      newStudent.setDecisions("Sit across the room with the studious kids.");
      newStudent.displayChoices();
      newStudentChecker = console.nextInt() - 1;
      if (newStudentChecker == 0) {
         //stat increase/decrease
         //Sitting with cool kids
         System.out.println();
         theChosenOne.updateIntel(1);
         theChosenOne.updateCharis(1);
         theChosenOne.updateFocus(-1);
         System.out.println("Intelligence has gone up by 1. Charisma has gone up by 1.");
         System.out.println("Focus has gone down by 1.");
         System.out.println("Alex Rickert sits in this corner! Would you like to befriend him?");
         console.next();
      } 
      else if (newStudentChecker == 1) {
         //stat increase/decrease
         //Sitting with studious kids
         System.out.println();
         theChosenOne.updateFocus(2);
         theChosenOne.updateCharis(-2);
         System.out.println("Focus has gone up by 2.");
         System.out.println("Charisma has gone down by 2.");
         System.out.println("Jetrin Wichienwidhtaya sits here! Would you like to befriend him?");
         console.next();
      }
      
      //Starting to learn
      Decision textbook = new Decision("You start learning how to code." , 4);
      int textbookChecker = 0;
      System.out.println();
      System.out.println(textbook.displayEvent());
      textbook.setDecisions("Read the textbook.");
      textbook.setDecisions("Learn on your own.");
      textbook.setDecisions("Learn from your friends.");
      textbook.setDecisions("Ask Ashley to do it all for you.");
      textbook.displayChoices();
      textbookChecker = console.nextInt() - 1;
      if (textbookChecker == 0) {
         //stat increase/decrease
         //Reading textbook
         System.out.println();
         theChosenOne.updateIntel(1);
         theChosenOne.updateFocus(1);
         System.out.println("Intelligence has gone up by 1. Focus has gone up by 1.");
      } else if (textbookChecker == 1) {
         //stat increase/decrease
         //Self learning
         System.out.println();
         theChosenOne.updateLuck(2);
         System.out.println("Luck has gone up by 2.");
      } else if (textbookChecker == 2) {
         //Friend learning
         theChosenOne.updateIntel(1);
         theChosenOne.updateCharis(1);
         System.out.println("Intelligence has gone up by 1. Charisma has gone up by 1.");
      } else {
         theChosenOne.updateIntel(-1);
         theChosenOne.updateCharis(-1);
         theChosenOne.updateFocus(-1);
         theChosenOne.updateLuck(-1);
         System.out.println("Ashley laughs at you. All stats decreased by 1.");
      }
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
      
      /*Decision subDay = new Decision("You have a sub in class!" , 2);
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
      */
      // First boss = rap god
      AttackOptions moves = new AttackOptions();
      AttackOptions bossFight = new AttackOptions();
      AttackOptions normalAttacks = new AttackOptions();
      AttackOptions specialAttacks = new AttackOptions();
      Attack attack = new Attack("Attack", 0);
      Attack special = new Attack("Special Attack", 0);  
      Attack study = new Attack("Study", 5);
      Attack summonKelvin = new Attack("Summon Kelvin", theChosenOne.getCharis());
      Attack bossAttack1 = new Attack("Kanye West Ego", 5);
      Attack bossAttack2 = new Attack("Lil B's Curse", 8);
      Attack bossAttack3 = new Attack("Spit Fire", 10);
      Attack bossAttack4 = new Attack("Mom's Spaghetti", 15);
      Attack bossAttack5 = new Attack("Deadline!!!!!", 99999);
      moves.addAttack(attack);
      moves.addAttack(special);
      normalAttacks.addAttack(study);
      specialAttacks.addAttack(summonKelvin);
      bossFight.addAttack(bossAttack1);
      bossFight.addAttack(bossAttack2);
      bossFight.addAttack(bossAttack3);
      bossFight.addAttack(bossAttack4);
      Boss rapBoss = new Boss(150, "The Rap God", 2,5);
      System.out.println(rapBoss.getName() + " has appeared! What do you do?");
      int deadline = 0;
      while (rapBoss.getHp() > 0 && theChosenOne.getHp() > 0) {
         moves.displayAttackOptions();
         int choiceType = console.nextInt();
         int theChosenAttack;
         if (choiceType == 1) {
            normalAttacks.displayAttackOptions();
            theChosenAttack = console.nextInt();
            normalAttacks.attacks().get(theChosenAttack - 1).useAttackPlayer(theChosenOne,rapBoss);

         } else if (choiceType == 2) {
            specialAttacks.displayAttackOptions();
            theChosenAttack = console.nextInt();
            specialAttacks.attacks().get(theChosenAttack - 1).useAttackPlayer(theChosenOne,rapBoss);

         }
         double randomAttack = (Math.random() * 100);
         if(rapBoss.getHp() > 0) {
            if (deadline != 10) {
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
            }
            if (deadline >= 17 && deadline < 19) {
               System.out.println("Deadline Approaches! " + (10 - deadline) + " Days Remaining!");
            } 
            else if (deadline == 19) {
               System.out.println("Deadline Approaches! " + (10 - deadline) + " Day Remaining!");
            } 
            if (deadline >= 20) {
               rapBoss.updateFocus(1000);
               bossFight.addAttack(bossAttack5);
               bossFight.attacks().get(4).useAttackBoss(theChosenOne,rapBoss);
            }
            deadline++;
         }
         System.out.println();
      }
      if (theChosenOne.getHp() > 0) {
         System.out.println("You have defeated the boss! You will be fully healed and gain 10 more HP to your max HP.");
         theChosenOne.setHp(10);
         theChosenOne.healHp();
         System.out.println("You have learned Cheat! You have learned Summon Tom!");
      } 
      else {
         System.out.println("You have failed! GAME OVER.");
      }
      deadline = 0;
      
      //more events if time
      
      //second boss = space needle
      AttackOptions spaceFight = new AttackOptions();
      Attack spaceAttack1 = new Attack("Spicy Space Needle", 5);
      Attack spaceAttack2 = new Attack("Space Piercing", 8);
      Attack spaceAttack3 = new Attack("Needle in a Haystack", 10);
      Attack spaceAttack4 = new Attack("Bloon Popper", 15);
      //normalAttacks.addAttack(study);
      //specialAttacks.addAttack(summonKelvin);
      spaceFight.addAttack(spaceAttack1);
      spaceFight.addAttack(spaceAttack2);
      spaceFight.addAttack(spaceAttack3);
      spaceFight.addAttack(spaceAttack4);
      Boss spaceBoss = new Boss(150, "The Space Needle", 2,5);
      System.out.println(spaceBoss.getName() + " has appeared! What do you do?");
      while (spaceBoss.getHp() > 0 && theChosenOne.getHp() > 0) {
         moves.displayAttackOptions();
         int choiceType = console.nextInt();
         int theChosenAttack;
         if (choiceType == 1) {
            normalAttacks.displayAttackOptions();
            theChosenAttack = console.nextInt();
            normalAttacks.attacks().get(theChosenAttack - 1).useAttackPlayer(theChosenOne,spaceBoss);

         } else if (choiceType == 2) {
            specialAttacks.displayAttackOptions();
            theChosenAttack = console.nextInt();
            specialAttacks.attacks().get(theChosenAttack - 1).useAttackPlayer(theChosenOne,spaceBoss);

         }
         double randomAttack = (Math.random() * 100);
         if(spaceBoss.getHp() > 0) {
            if (deadline != 10) {
               if(randomAttack < 25) {
                  spaceFight.attacks().get(0).useAttackBoss(theChosenOne,spaceBoss);
               } 
               else if(randomAttack >= 25 || randomAttack < 50) {
                  spaceFight.attacks().get(1).useAttackBoss(theChosenOne,spaceBoss);
               } 
               else if(randomAttack >= 50 || randomAttack < 75) {
                  spaceFight.attacks().get(2).useAttackBoss(theChosenOne,spaceBoss);
               } 
               else {
                  spaceFight.attacks().get(3).useAttackBoss(theChosenOne,spaceBoss);
               }
            }
            if (deadline >= 17 && deadline < 19) {
               System.out.println("Deadline Approaches! " + (10 - deadline) + " Days Remaining!");
            } 
            else if (deadline == 19) {
               System.out.println("Deadline Approaches! " + (10 - deadline) + " Day Remaining!");
            } 
            if (deadline >= 20) {
               spaceBoss.updateFocus(1000);
               spaceFight.addAttack(bossAttack5);
               spaceFight.attacks().get(4).useAttackBoss(theChosenOne,spaceBoss);
            }
            deadline++;
         }
         System.out.println();
      }
      if (theChosenOne.getHp() > 0) {
         System.out.println("You have defeated the boss! You will be fully healed and gain 10 more HP to your max HP.");
         theChosenOne.setHp(10);
         theChosenOne.healHp();
      } 
      else {
         System.out.println("You have failed! GAME OVER.");
      }
      deadline = 0;
      
      // more events
      
      //third boss = baby names
      
      AttackOptions babyFight = new AttackOptions();
      Attack babyAttack1 = new Attack("Cries", 5);
      Attack babyAttack2 = new Attack("Baby Food", 8);
      Attack babyAttack3 = new Attack("Dirty Diaper", 10);
      Attack babyAttack4 = new Attack("Bottle Toss", 15);
      //normalAttacks.addAttack(study);
      //specialAttacks.addAttack(summonKelvin);
      babyFight.addAttack(babyAttack1);
      babyFight.addAttack(babyAttack2);
      babyFight.addAttack(babyAttack3);
      babyFight.addAttack(babyAttack4);
      Boss babyBoss = new Boss(150, "Baby Names", 2,5);
      System.out.println(spaceBoss.getName() + " has appeared! What do you do?");
      while (babyBoss.getHp() > 0 && theChosenOne.getHp() > 0) {
         moves.displayAttackOptions();
         int choiceType = console.nextInt();
         int theChosenAttack;
         if (choiceType == 1) {
            normalAttacks.displayAttackOptions();
            theChosenAttack = console.nextInt();
            normalAttacks.attacks().get(theChosenAttack - 1).useAttackPlayer(theChosenOne,babyBoss);

         } else if (choiceType == 2) {
            specialAttacks.displayAttackOptions();
            theChosenAttack = console.nextInt();
            specialAttacks.attacks().get(theChosenAttack - 1).useAttackPlayer(theChosenOne,babyBoss);

         }
         double randomAttack = (Math.random() * 100);
         if(babyBoss.getHp() > 0) {
            if (deadline != 10) {
               if(randomAttack < 25) {
                  babyFight.attacks().get(0).useAttackBoss(theChosenOne,babyBoss);
               } 
               else if(randomAttack >= 25 || randomAttack < 50) {
                  babyFight.attacks().get(1).useAttackBoss(theChosenOne,babyBoss);
               } 
               else if(randomAttack >= 50 || randomAttack < 75) {
                  babyFight.attacks().get(2).useAttackBoss(theChosenOne,babyBoss);
               } 
               else {
                  babyFight.attacks().get(3).useAttackBoss(theChosenOne,babyBoss);
               }
            }
            if (deadline >= 17 && deadline < 19) {
               System.out.println("Deadline Approaches! " + (10 - deadline) + " Days Remaining!");
            } 
            else if (deadline == 19) {
               System.out.println("Deadline Approaches! " + (10 - deadline) + " Day Remaining!");
            } 
            if (deadline >= 20) {
               babyBoss.updateFocus(1000);
               babyFight.addAttack(bossAttack5);
               babyFight.attacks().get(4).useAttackBoss(theChosenOne,babyBoss);
            }
            deadline++;
         }
         System.out.println();
      }
      if (theChosenOne.getHp() > 0) {
         System.out.println("You have defeated the boss! You will be fully healed and gain 10 more HP to your max HP.");
         theChosenOne.setHp(10);
         theChosenOne.healHp();
      } 
      else {
         System.out.println("You have failed! GAME OVER.");
      }
      deadline = 0;
      
      // more decisions
      
      //fourth boss = shopping cart
      
      AttackOptions shoppingFight = new AttackOptions();
      Attack shoppingAttack1 = new Attack("Cries", 5);
      Attack shoppingAttack2 = new Attack("Baby Food", 8);
      Attack shoppingAttack3 = new Attack("Dirty Diaper", 10);
      Attack shoppingAttack4 = new Attack("Bottle Toss", 15);
      //normalAttacks.addAttack(study);
      //specialAttacks.addAttack(summonKelvin);
      shoppingFight.addAttack(shoppingAttack1);
      shoppingFight.addAttack(shoppingAttack2);
      shoppingFight.addAttack(shoppingAttack3);
      shoppingFight.addAttack(shoppingAttack4);
      Boss shoppingBoss = new Boss(150, "The Shopping Cart", 2,5);
      System.out.println(shoppingBoss.getName() + " has appeared! What do you do?");
      while (shoppingBoss.getHp() > 0 && theChosenOne.getHp() > 0) {
         moves.displayAttackOptions();
         int choiceType = console.nextInt();
         int theChosenAttack;
         if (choiceType == 1) {
            normalAttacks.displayAttackOptions();
            theChosenAttack = console.nextInt();
            normalAttacks.attacks().get(theChosenAttack - 1).useAttackPlayer(theChosenOne,shoppingBoss);

         } else if (choiceType == 2) {
            specialAttacks.displayAttackOptions();
            theChosenAttack = console.nextInt();
            specialAttacks.attacks().get(theChosenAttack - 1).useAttackPlayer(theChosenOne,shoppingBoss);

         }
         double randomAttack = (Math.random() * 100);
         if(shoppingBoss.getHp() > 0) {
            if (deadline != 10) {
               if(randomAttack < 25) {
                  shoppingFight.attacks().get(0).useAttackBoss(theChosenOne,shoppingBoss);
               } 
               else if(randomAttack >= 25 || randomAttack < 50) {
                  shoppingFight.attacks().get(1).useAttackBoss(theChosenOne,shoppingBoss);
               } 
               else if(randomAttack >= 50 || randomAttack < 75) {
                  shoppingFight.attacks().get(2).useAttackBoss(theChosenOne,shoppingBoss);
               } 
               else {
                  shoppingFight.attacks().get(3).useAttackBoss(theChosenOne,shoppingBoss);
               }
            }
            if (deadline >= 17 && deadline < 19) {
               System.out.println("Deadline Approaches! " + (10 - deadline) + " Days Remaining!");
            } 
            else if (deadline == 19) {
               System.out.println("Deadline Approaches! " + (10 - deadline) + " Day Remaining!");
            } 
            if (deadline >= 20) {
               shoppingBoss.updateFocus(1000);
               shoppingFight.addAttack(bossAttack5);
               shoppingFight.attacks().get(4).useAttackBoss(theChosenOne,shoppingBoss);
            }
            deadline++;
         }
         System.out.println();
      }
      if (theChosenOne.getHp() > 0) {
         System.out.println("You have defeated the boss! You will be fully healed and gain 10 more HP to your max HP.");
         theChosenOne.setHp(10);
         theChosenOne.healHp();
      } 
      else {
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