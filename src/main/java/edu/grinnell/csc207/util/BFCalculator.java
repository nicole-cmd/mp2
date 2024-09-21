package edu.grinnell.csc207.util;

import java.math.BigInteger;
import edu.grinnell.csc207.util.BigFraction;
import java.lang.String;
import java.lang.Boolean;

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
      if (this.lastAnswer.num.mod(this.lastAnswer.num).intValue() == 0) {
        return lastAnswer; // indicates there is a value stored in lastAnswer
      } /** if - determines if there is a previously computed value by mod'ing the 
            numerator of lastAnswer and comparing to 0 */

      return new BigFraction(0, 0); // else - returns 0
    } // get()

    /**
     * Adds a BigFraction to the last computed answer, then stores result
     * as the last computed answer.
     * 
     * @param val
     *    The BigFraction to add to lastAnswer.
     * 
     * @return none
     *    Computed value gets stored in lastAnswer.
     * 
     */
    public void add(BigFraction val) {
      // add denominators and store in lastAnswer
      this.lastAnswer.denom = this.lastAnswer.denom.add(val.denom); 

      // add numerators and store in lastAnswer
      this.lastAnswer.num = this.lastAnswer.num.add(val.num);
    } // add(BigFraction)

    /**
     * Subtracts a BigFraction from the last computed answer, then 
     * stores result as the last computed answer.
     * 
     * @param val
     *    The BigFraction to subtract from lastAnswer.
     * 
     * @return none
     *    Computed value gets stored in lastAnswer.
     * 
     */
    public void subtract(BigFraction val) {
      // subtract denominators and store in lastAnswer
      this.lastAnswer.denom = this.lastAnswer.denom.subtract(val.denom); 

      // subtract numerators and store in lastAnswer
      this.lastAnswer.num = this.lastAnswer.num.subtract(val.num);
    } // subtract(BigFraction) 
    
    /**
     * Multiplies a BigFraction to the last computed answer, then 
     * stores result as the last computed answer.
     * 
     * @param val
     *    The BigFraction to multiply to lastAnswer.
     * 
     * @return none
     *    Computed value gets stored in lastAnswer.
     * 
     */
    public void multiply(BigFraction val) {
      this.lastAnswer.num = this.lastAnswer.num.multiply(val.num);
      this.lastAnswer.denom = this.lastAnswer.denom.multiply(val.denom); 
    } // multiply(BigFraction)

    /**
     * Divides a BigFraction from the last computed answer, then 
     * stores result as the last computed answer.
     * 
     * @param val
     *    The BigFraction to divide lastAnswer.
     * 
     * @return none
     *    Quotient gets stored in lastAnswer.
     * 
     */  
    public void divide(BigFraction val) {
      this.lastAnswer.num = this.lastAnswer.num.divide(val.num);
      this.lastAnswer.denom = this.lastAnswer.denom.divide(val.denom);
    } // divide(BigFraction)

    /**
     * Resets last computed answer to 0.
     * 
     * @param none
     *    Object reference to method fulfills
     *    any necessity for parameters.
     * 
     * @return none
     *    lastAnswer will be reset and stored as such.
     * 
     */
    public void clear() {
      this.lastAnswer = new BigFraction(0, 0);
    } // clear()
} //class BFCalculator