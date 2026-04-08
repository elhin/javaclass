package Chapter9;

public class RegularPolygon {
  // Write your code
  private int n = 3;
  private double side = 1;
  private double x = 0;
  private double y = 0;

  public RegularPolygon(){
    this.n = 3;
    this.side = 1;
    this.x = 0.0;
    this.y = 0.0;
  }

  public RegularPolygon(int n, double side){
    this.n = n;
    this.side = side;
    this.x = 0.0;
    this.y = 0.0;
  }

  public RegularPolygon(int n, double side, double x, double y){
    this.n = n;
    this.side = side;
    this.x = x;
    this.y = y;
  }

  public int getN(){
    return n;
  }

  public double getSide(){
    return side;
  }

  public double getX(){
    return x;
  }
  
  public double getY(){
    return y;
  }

  public void setN(int n){
    this.n = n;
  }

  public void setSide(double side){
    this.side = side;
  }

  public void setX(double x){
    this.x = x;
  }

  public void setY(double y){
    this.y = y;
  }

  public double getPerimeter(double side, int n){
    double perimeter = side * n;
    System.out.println("Perimeter is " + perimeter);
    return perimeter;
  }

  public double getArea(double side, int n){
    double area = ((side * side) * n) / (4 * Math.tan(Math.PI / n));
    System.out.println("Area is " + area);
    return area;
  }
}