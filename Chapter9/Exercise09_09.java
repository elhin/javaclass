package Chapter9;
public class Exercise09_09 {
  public static void main(String[] args) {
    // Write your code
    RegularPolygon myPoly1 = new RegularPolygon();
    RegularPolygon myPoly2 = new RegularPolygon(6, 4);
    RegularPolygon myPoly3 = new RegularPolygon(10, 4, 5.6, 7.8);

    System.out.println("Perimeter of my Poly 1 is " + myPoly1.getPerimeter(1, 3));
    System.out.println("Area of my Poly 1 is " + myPoly1.getArea(1, 3));
    System.out.println("Perimeter of Poly 2 is " + myPoly2.getPerimeter(4, 6));
    System.out.println("Area of Poly 2 is " + myPoly2.getArea(4, 6));
    System.out.println("Perimeter of Poly 3 is " + myPoly3.getPerimeter(4, 10));
    System.out.println("Area of Poly 3 is " + myPoly3.getArea(4, 10));
  }
}
