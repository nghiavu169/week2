package Lesson6.CircleNCylinder;

public class Cylinder extends Circle {
    public Cylinder(){}

    public Cylinder(double radius){
        super(radius);
    }

    public String toString(){
        return "bottom shape of Cylinder is Circle with length of radius is: " + super.getRadius();
    }
    public static class Test{
        public static void main(String[] args) {
            Circle rad = new Cylinder(10);
            System.out.println(rad.toString());
        }
    }
}
