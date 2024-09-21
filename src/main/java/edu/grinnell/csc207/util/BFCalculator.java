package edu.grinnell.csc207.util;

import java.math.BigInteger;
import edu.grinnell.csc207.util.BigFraction;

/**
 * Primarily performs the math on BigFraction inputs.
 */

public class BFCalculator {
  // +--------+-------------------------------------------------------
  // | Fields |
  // +--------+

  /** Will store previously computed answers */
  BigFraction lastAnswer; 

  // +---------+------------------------------------------------------
  // | Methods |
  // +---------+

    /**
     * Returns the last computed value. If there is none,
     * returns 0.
     * 
     * @param none
     * 
     * @return last computed value
     * 
     */
    public BigFraction get() {
      if (lastAnswer.num.intValue() > 0) {
        return lastAnswer;
      } /** if - determines if the numerator of lastAnswer is greater
            than 0 (if it were 0, then ) */

      return new BigFraction(0, 0);
    }
} //class BFCalculator
