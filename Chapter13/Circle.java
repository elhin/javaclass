package Chapter13;

public class Circle extends GeometricObject implements Comparable<Circle>{
    private double radius;

    public Circle(){

    }

    public Circle (double radius){
        this.radius = radius;
    }

    /*return radius */
    public double getRadius(){
        return radius;
    }

    @Override /**return area */
    public double getArea(){
        return radius * radius * Math.PI;
    }

    /**Return diameter */
    public double getDiameter(){
        return 2 * radius;
    }

    @Override /**Return perimeter */
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override /*compares with circles */
    public int compareTo(Circle o){
        if (this.getRadius() > o.getRadius()){
            return 1;
        }
        else if (this.getRadius() < o.getRadius()){
            return -1;
        }
        else 
            return 0;
    }

    @Override //* referenced  https://www.reddit.com/r/learnjava/comments/9xx353/comment/e9wg3cu/*/
    public boolean equals(Object o){
        if (o == this){
            return true;
        }
        if (!(o instanceof Circle)){
            return false;
        }
        Circle c = (Circle) o;
        double difference = radius - c.getRadius();
        return (difference < 0.00000001) && (difference > 0.00000001);
    }

    /** Print the circle info */

    public void printCircle(){
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }
}
