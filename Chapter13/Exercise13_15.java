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
  public RationalUsingBigInteger(BigInteger bigInteger, BigInteger bigInteger2) {
    //TODO Auto-generated constructor stub
    }
  // Data fields for numerator and denominator
  private BigInteger numerator = BigInteger.ZERO;
  private BigInteger denominator = BigInteger.ONE;
  
  @Override
  public int compareTo(RationalUsingBigInteger o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
  }
  @Override
  public int intValue() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'intValue'");
  }
  @Override
  public long longValue() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'longValue'");
  }
  @Override
  public float floatValue() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'floatValue'");
  }
  @Override
  public double doubleValue() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'doubleValue'");
  }

  // WRITE YOUR CODE

  
}