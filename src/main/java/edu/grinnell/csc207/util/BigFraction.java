package edu.grinnell.csc207.util;

import java.math.BigInteger;

/**
 * Extended version of the Fraction class from the "Designing your own classes"
 * lab for MP2 purposes.
 *
 * @author (of lab): Samuel A. Rebelsky
 * @author (of lab work): Alyssa Ryan and Nicole Gorrell
 * @author (MP modifications): Nicole Gorrell
 *         Contributions include subtract and divide methods, as well as documentation
 *         for fractional and multiply methods. Removed several constructors and 
 *         methods that were included in the lab, but go beyond this project's scope.
 */
public class BigFraction {
  // +------------------+---------------------------------------------
  // | Design Decisions |
  // +------------------+

  /*
   * (1) Denominators are always positive. Therefore, negative fractions
   * are represented with a negative numerator. Similarly, if a fraction
   * has a negative numerator, it is negative.
   *
   */

  // +-----------+---------------------------------------------------
  // | Constants |
  // +-----------+

  /** The default numerator when creating fractions. */
  //private static final BigInteger DEFAULT_NUMERATOR = BigInteger.valueOf(2);

  /** The default denominator when creating fractions. */
  //private static final BigInteger DEFAULT_DENOMINATOR = BigInteger.valueOf(7);

  // +--------+-------------------------------------------------------
  // | Fields |
  // +--------+

  /** The numerator of the fraction. Can be positive, zero or negative. */
  BigInteger num;

  /** The denominator of the fraction. Must be non-negative. */
  BigInteger denom;

  // +--------------+-------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new fraction with numerator num and denominator denom.
   *
   * Warning! Not yet stable.
   *
   * @param numerator
   *   The numerator of the fraction.
   * @param denominator
   *   The denominator of the fraction.
   */
  public BigFraction(BigInteger numerator, BigInteger denominator) {
    this.num = numerator;
    this.denom = denominator;
  } // BigFraction(BigInteger, BigInteger)

  /**
   * Build a new fraction with numerator num and denominator denom.
   *
   * Warning! Not yet stable.
   *
   * @param numerator
   *   The numerator of the fraction.
   * @param denominator
   *   The denominator of the fraction.
   */
  public BigFraction(int numerator, int denominator) {
    this.num = BigInteger.valueOf(numerator);
    this.denom = BigInteger.valueOf(denominator);
  } // BigFraction(int, int)

  /**
   * Build a new fraction by parsing a string.
   *
   * Warning! Not yet implemented.
   *
   * @param str
   *   The fraction in string form
   */
  public BigFraction(String str) {
    int index = str.indexOf('/');
    int temp = Integer.valueOf(str.substring(0, index-1));
    this.num = BigInteger.valueOf(temp);
    temp = Integer.valueOf(str.substring(index+1));
    this.denom = BigInteger.valueOf(temp);

  } // BigFraction(String)

  // +---------+------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Add another fraction to this fraction.
   *
   * @param addend
   *   The fraction to add.
   *
   * @return the result of the addition.
   */
  public BigFraction add(BigFraction addend) {
    BigInteger resultNumerator;
    BigInteger resultDenominator;

    // The denominator of the result is the product of this object's
    // denominator and addend's denominator
    resultDenominator = this.denom.multiply(addend.denom);
    // The numerator is more complicated
    resultNumerator =
      (this.num.multiply(addend.denom)).add(addend.num.multiply(this.denom));

    // Return the computed value
    return new BigFraction(resultNumerator, resultDenominator);
  } // add(BigFraction)

  /**
   * Subtract another fraction from this fraction.
   *
   * @param subtrahend
   *   The fraction to subtract.
   *
   * @return the result of the subtraction.
   */
  public BigFraction subtract(BigFraction subtrahend) {
    BigInteger resultNumerator;
    BigInteger resultDenominator;

    // The denominator of the result is the product of this object's
    // denominator and subtrahend's denominator
    resultDenominator = this.denom.multiply(subtrahend.denom);
    // The numerator is more complicated
    resultNumerator =
      (this.num.multiply(subtrahend.denom)).subtract(subtrahend.num.multiply(this.denom));

    // Return the computed value
    return new BigFraction(resultNumerator, resultDenominator);
  } // subtract(BigFraction)

  /**
   * Multiply another fraction to this fraction.
   *
   * @param multiple
   *   The fraction to multiply.
   *
   * @return the result of the multiplication.
   */
  public BigFraction multiply(BigFraction multiple){
    BigInteger numresult;
    BigInteger denomresult;

    numresult = this.num.multiply(multiple.num);
    denomresult = this.num.multiply(multiple.denom);

    return new BigFraction(numresult, denomresult);
  } //multiply(BigFraction)

  /**
   * Divide another fraction from this fraction.
   *
   * @param dividend
   *   The fraction to divide.
   *
   * @return the result of the division.
   */
  public BigFraction divide(BigFraction dividend){
    BigInteger numresult;
    BigInteger denomresult;

    numresult = this.num.divide(dividend.num);
    denomresult = this.num.divide(dividend.denom);

    return new BigFraction(numresult, denomresult);
  } //multiply(BigFraction)

  /**
   * Return the fractional portion of a BigFraction.
   * Ideal for improper BigFractions where the numerator is 
   * greater than the denominator.
   *
   * @param none
   *   Object reference to method fulfills
   *   any necessity for parameters.
   *
   * @return the fractional remainder of an improper BigFraction when
   *         simplified.
   */
  public BigFraction fractional() {
    BigInteger numresult; 

    numresult = this.num.mod(this.denom);
  
    return new BigFraction(numresult, this.denom);
  } //fractional()

  /**
   * Return a simplified BigFraction
   * 
   * @param none
   *    Method references its own object.
   * @return the simplified BigFraction input.
   */
  public BigFraction simplify() {
    BigInteger numresult = this.num.gcd(this.num);

    BigInteger denomresult = this.denom.gcd(this.denom);

    return new BigFraction(numresult, denomresult);
  } //simplify()

  /**
   * Convert this fraction to a string for ease of printing.
   *
   * @return a string that represents the fraction.
   */
  public String toString() {
    // Special case: It's zero
    if (this.num.equals(BigInteger.ZERO)) {
      return "0";
    } // if it's zero

    // Lump together the string represention of the numerator,
    // a slash, and the string representation of the denominator
    // return this.num.toString().concat("/").concat(this.denom.toString());
    return this.num + "/" + this.denom;
  } // toString()
} // class BigFraction