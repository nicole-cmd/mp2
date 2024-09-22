package edu.grinnell.csc207.util;

import java.lang.String;
import java.lang.Character;

/**
 * Sets type char registers to BigFraction values and computations.
 */

public class BFRegisterSet {
  // +-----------+---------------------------------------------------
  // | Constants |
  // +-----------+

  /** The maximum number of lowercase alphabet characters available to use
   *  as registers.
  */
  private static int MAX_CHARS = 26;

  /** List of possible registers. */
  char[] alphabetList = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g',
                                    'h', 'i', 'j', 'k', 'l', 'm', 'n',
                                    'o', 'p', 'q', 'r', 's', 't', 'u',
                                    'v', 'w', 'x', 'y', 'z'};

  /** Default value of an empty register. */
  BigFraction zero = new BigFraction(0, 0);

  /** A list of stored BigFractions. */
  BigFraction[] storedFractions = new BigFraction[MAX_CHARS - 1];

  // +---------+------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Stores a BigFraction in a given char register.
   * 
   * @param register
   *      The designated char register the value will be stored in.
   * @param val
   *      The designated value that will be stored in a register.
   * 
   * @return none
   *      val will be stored in register and accessible through that
   *      char.
   * 
   */
  public void store(char register, BigFraction val) {
    // converts input char to String for comparison
    String comp = Character.toString(register);

    for(int i: alphabetList) {
      // converts character in alphabetList to String for comparison
      String availableLetter = Character.toString(alphabetList[i]);

      if(comp.equals(availableLetter)) {
        storedFractions[i] = val;
      } // if
    } // for
  } // store(char, BigFraction)
  
  /**
   * Retrieves a BigFraction stored in a given register.
   * 
   * @param register
   *      The specified register we want to know the BigFraction value
   *      of.
   * 
   * @return BigFraction
   *      Returns the value stored in said register. 
   */
  public BigFraction get(char register) {
    // converts input char to String for comparison
    String comp = Character.toString(register);

    for (int i: alphabetList) {
      // converts character in alphabetList to String for comparison
      String availableLetter = Character.toString(alphabetList[i]);

      if(comp.equals(availableLetter)) {
        return storedFractions[i];
      } // if
    } // for 
    
    return zero; // returns default BigFraction 0/0 when there is no BigFraction register
  } //get(char)
} //class BFRegisterSet
