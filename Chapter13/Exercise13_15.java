package Chapter13;

// Look for WRITE YOUR CODE to write your code
import java.math.*;
import java.util.Scanner;

public class Exercise13_15 {
  public static void main(String[] args) {
    // Prompt the user to enter two Rational numbers
    Scanner input = new Scanner(System.in);
    System.out.print("Enter rational r1 with numerator and denominator seperated by a space: ");
    String n1 = input.next();
    String d1 = input.next();

    System.out.print("Enter rational r2 with numerator and denominator seperated by a space: ");
    String n2 = input.next();
    String d2 = input.next();

    RationalUsingBigInteger r1 = new RationalUsingBigInteger(
      new BigInteger(n1), new BigInteger(d1));
    RationalUsingBigInteger r2 = new RationalUsingBigInteger(
      new BigInteger(n2), new BigInteger(d2));

    // Display results
    System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
    System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
    System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
    System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
    System.out.println(r2 + " is " + r2.doubleValue());
  }
}

// Name the revised Rational class RationalUsingBigInteger 
class RationalUsingBigInteger extends Number 
    implements Comparable<RationalUsingBigInteger> {


  // Data fields for numerator and denominator
  private BigInteger numerator = BigInteger.ZERO;
  private BigInteger denominator = BigInteger.ONE;

  public RationalUsingBigInteger(){
    this.numerator = BigInteger.ZERO;
    this.denominator = BigInteger.ONE;
  }
  
  public RationalUsingBigInteger(BigInteger bigInteger, BigInteger bigInteger2) {
    BigInteger gcd = gcd(numerator, denominator);
    this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
    this.denominator = Math.abs(getDenominator()) / gcd;   
    }

/**     private static BigInteger gcd(BigInteger n, BigInteger d){
      int n1 = abs(n);
      int n2 = abs(d);
      int gcd = 1;

    for (int k = 1; k <= n1 && k <= n2; k++) {
      if (n1 % k == 0 && n2 % k == 0) 
        gcd = k;
    }

    return gcd;
    }*/

    /** Return numerator */
  public BigInteger getNumerator() {
    return numerator;
  }

  /** Return denominator */
  public BigInteger getDenominator() {
    return denominator;
  }

  /** Add a rational number to this rational */
  public RationalUsingBigInteger add(RationalUsingBigInteger secondRational) {
    BigInteger n = (numerator.multiply(secondRational.getDenominator())).add(denominator.multiply(secondRational.getNumerator()));
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new RationalUsingBigInteger(n, d);
  }

  /** Subtract a rational number from this rational */
  public RationalUsingBigInteger subtract(RationalUsingBigInteger secondRational) {
    BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new RationalUsingBigInteger(n, d);
  }

  /** Multiply a rational number to this rational */
  public RationalUsingBigInteger multiply(RationalUsingBigInteger secondRational) {
    BigInteger n = numerator.multiply(secondRational.getNumerator());
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new RationalUsingBigInteger(n, d);
  }

  /** Divide a rational number from this rational */
  public RationalUsingBigInteger divide(RationalUsingBigInteger secondRational) {
    BigInteger n = numerator.multiply(secondRational.getDenominator());
    BigInteger d = denominator.multiply(secondRational.getNumerator());
    return new RationalUsingBigInteger(n, d);
  }

  @Override
  public int compareTo(RationalUsingBigInteger o) {
    if (this.subtract(o).getNumerator() > 0)
      return 1;
    else if (this.subtract(o).getNumerator() < 0)
      return -1;
    else 
      return 0;
  }
  @Override
  public int intValue() {
    return (int)doubleValue();
  }
  @Override
  public long longValue() {
    return (long)doubleValue();
  }
  @Override
  public float floatValue() {
    return (float)doubleValue();
  }

   @Override
  public double doubleValue() {
    double dNumerator = this.getNumerator();

    //*figure out how to convert this 
    return (numerator.multiply((long) 1.0)).divide(this.getDenominator());
  }

  // WRITE YOUR CODE

  
}