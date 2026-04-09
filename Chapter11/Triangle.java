package Chapter11;

//11.1 (The Triangle class) Design a class named Triangle that extends GeometricObject. The class contains:
public class Triangle extends GeometricObject{
    //Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of a triangle.
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

//A no-arg constructor that creates a default triangle.
    public Triangle(){
        
    //    this.side1 = side1;
    //    this.side2 = side2;
    //    this.side3 = side3;
    }

    //A constructor that creates a triangle with the specified side1, side2, and side3.
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, Boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //The accessor methods for all three data fields.
    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }
    
    public double getSide3(){
        return side3;
    }

    //A method named getArea() that returns the area of this triangle.
    @Override
    public double getArea(){
        System.out.println("Area accessed.");
        double perimeter = getPerimeter();
        double s = perimeter / 2;
        double h = s * (s - side1) * (s - side2) * (s - side3);
        double area = Math.sqrt(h);
        return area;
    }    

    //A method named getPerimeter() that returns the perimeter of this triangle.
    @Override
    public double getPerimeter(){
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }

    //A method named toString() that returns a string description for the triangle.
    public String toString(double side1, double side2, double side3){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}







/// 