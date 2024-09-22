package edu.grinnell.csc207.util;

/**
 * Primarily performs the math on BigFraction inputs.
 */

public class BFCalculator {
  // +--------+-------------------------------------------------------
  // | Fields |
  // +--------+

  /** Will store previously computed answers. Initialized to
   *  BigFraction 0/0 when there are no computed answers to be stored.
   */
  BigFraction lastAnswer = new BigFraction(0, 0); 

  // +---------+------------------------------------------------------
  // | Methods |
  // +---------+

    /**
     * Returns the last computed value. If there is none,
     * returns 0 (initialized value of lastAnswer).
     * 
     * @param none
     * 
     * @return last computed value
     * 
     */
    public BigFraction get() {
      return lastAnswer;
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
      this.lastAnswer.add(val); 
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
      this.lastAnswer.subtract(val); 
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
      this.lastAnswer.multiply(val); 
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
      this.lastAnswer.divide(val); 
    } // divide(BigFraction)

    /**
     * Resets last computed answer to 0.
     * 
     * @param none
     *    Object reference to method fulfills
     *    any necessity for parameters.
     * 
     * @return none
     *    lastAnswer will be reset to 0 and stored as such.
     * 
     */
    public void clear() {
      this.lastAnswer = new BigFraction(0, 0);
    } // clear()
} //class BFCalculator