/*
care pkg accepted from
https://github.com/ap251/library/blob/main/lab01/YoRPG/v0/YoRPG.java
*/

/**********************************************
 * class YoRPG -- Driver file for Ye Olde Role Playing Game.
 * Simulates monster encounters of a wandering adventurer.
 * Required classes: Protagonist, Monster
 * 
 * USAGE:
 * Compile. Note messages generated.
 * Devise a plan of attack with your trio.
 * Code incrementally, testing each bit of new functionality as you go.
 * The only modification you should make to this driver file is moving comment bar down in main method, and filling in DISCO/QCC
 * (If you feel other changes are merited, note what and why, so that we may discuss on the 'morrow.)
 * 
 * DISCO:
 *  - You can have a class instance take the value of a class instance of one of it's children
 *  - You can use try/except to do error handling, if all other solutions fail
 *  - ALL_CAPS are standard syntax for "final"'s
 * QCC:
 *  - Is our game really working the way it's supposed to? We're honestly not completely sure, because
      we don't have a reference for how the game is supposed to run, and the game is somewhat small.
 *  - How exactly does the "encounters" variable work? It seems like it is incrementing faster than it
 *    should sometimes
 **********************************************/

/***

 * Modifications made (during 2021-11-24 -> 2021-11-25)
 *  - Fixed game functionality, the game now completely runs
 *  - Updated stats for each monster/protagonist
 *  - Playtested the game multiple times on different difficulties
 *  - Updated "pre" sections

***/

import java.io.*;
import java.util.*;

public class YoRPG {

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

  //change this constant to set number of encounters in a game
  public final static int MAX_ENCOUNTERS = 5;

  //each round, a Protagonist and a Monster will be instantiated...
  private Protagonist pat;
  private Monster smaug;

  // creating an instance of every type, to be used;

  private int moveCount;
  private boolean gameOver;
  private int difficulty;

  private InputStreamReader isr;
  private BufferedReader in;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
  public YoRPG() {
    moveCount = 0;
    gameOver = false;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
  }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public Protagonist setCharacter(String s, String name) {
    Protagonist c = new Protagonist();
    if (s.toLowerCase().equals("paladin"))
      c = new Paladin(name);
    else if (s.toLowerCase().equals("cleric"))
      c = new Cleric(name);
    else if (s.toLowerCase().equals("wizard"))
      c = new Wizard(name);
    return c;
  }

  public Monster setMonster() {
    Monster c = new Monster();
    int choice = (int)(Math.random() * 3);
    if (choice == 0)
      c = new Ogre();
    else if (choice == 1)
      c = new Goblin();
    else if (choice == 2)
      c = new Leviathan();
    return c;
  }
  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

  /*=============================================
    void newGame() -- gathers info to begin a new game
    pre:  variable "difficulty" has been declared
    post: according to user input, modifies instance var for difficulty 
    and instantiates a Protagonist
    =============================================*/
  public void newGame() {
    String s;
    String name = "";
    String _class;
    s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

    s += "\nChoose your difficulty: \n";
    s += "\t1: Easy\n";
    s += "\t2: Not so easy\n";
    s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
    s += "Selection: ";
    System.out.print( s );

    boolean setDifficulty = false;
    while (!setDifficulty) {
        try {
    	    difficulty = Integer.parseInt( in.readLine() );
	    setDifficulty = true;
        }
        catch ( Exception e ) {
   	    System.out.println("HUH? NO HATH PICKED A NUMBER??");
	    System.out.println("CHOOSE AGAIN PLEASE");
        }
    }

    s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
    System.out.print( s );

    boolean setName = false;
    while (!setName) {
        try {
	    name = in.readLine();
            setName = true;
        }
        catch ( IOException e ) {
            System.out.print("Hmmmm you did something wrong, try again.\nIntrepid protagonist, what doth thy call thyself? (State your name): ");
        }
    }
    s = "And which class would you like to be? (Cleric / Paladin / Wizard): ";
    
    System.out.print( s );
    try {
	    // we are currently running into an error here, where it's not able to keep track of the class.
	    // see this comment: https://piazza.com/class/kue5pmk0w7n70n?cid=294_f1
            _class = in.readLine();
            pat = setCharacter(_class, name);
    }
    catch ( IOException e ) {
	    System.out.println("Twas not a valid class name");
    }

    //instantiate the player's character

  }//end newGame()


  /*=============================================
    boolean playTurn -- simulates a round of combat
    pre:  Protagonist pat has been initialized
    post: Returns true if player wins (monster dies).
    Returns false if monster wins (player dies).
    =============================================*/
  public boolean playTurn() {
    int i = 1;
    int d1, d2;

    if ( Math.random() >= ( difficulty / 3.0 ) ) {
      // this seems to be a somewhat unnecessary message
      // System.out.println( "\nNothing to see here. Move along!" );
    }
    else {
      System.out.println( "\nLo, yonder monster approacheth!" );

      smaug = setMonster();
      System.out.println("You encountered a Monster named " + smaug._name);

      while( smaug.isAlive() && pat.isAlive() ) {

        // Give user the option of using a special attack:
        // If you land a hit, you incur greater damage,
        // ...but if you get hit, you take more damage.
        try {
          System.out.println( "\nDo you feel lucky?" );
          System.out.println( "\t1: Nay.\n\t2: Aye!" );
          i = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e ) {
	  System.out.println("AGH YOU DIDNT ENTER SOMETHING VALID");
	}

        if ( i == 2 )
          pat.specialize();
        else
          pat.normalize();

        d1 = pat.attack( smaug );
        d2 = smaug.attack( pat );

        System.out.println( "\n" + pat.getName() + " dealt " + d1 +
                            " points of damage.");

        System.out.println( "\n" + smaug._name + " smacked " + pat.getName() +
                            " for " + d2 + " points of damage.");
      }//end while

      //option 1: you & the monster perish
      if ( !smaug.isAlive() && !pat.isAlive() ) {
        System.out.println( "'Twas an epic battle, to be sure... " + 
                            "You cut ye olde monster down, but " +
                            "with its dying breath ye olde monster. " +
                            "laid a fatal blow upon thee." );
        return false;
      }
      //option 2: you slay the beast
      else if ( !smaug.isAlive() ) {
        System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
        return true;
      }
      //option 3: the beast slays you
      else if ( !pat.isAlive() ) {
        System.out.println( "Ye olde self hath expired. You got dead." );
        return false;
      }
    }//end else

    return true;
  }//end playTurn()
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main( String[] args ) {
    //As usual, move the begin-comment bar down as you progressively 
    //test each new bit of functionality...

    //loading...
    YoRPG game = new YoRPG();

    int encounters = 0;

    while( encounters < MAX_ENCOUNTERS ) {
      if ( !game.playTurn() )
        break;
      encounters++;
    }

    System.out.println( "Thy game doth be over." );
    /*================================================
      ================================================*/
  }//end main

}//end class YoRPG
