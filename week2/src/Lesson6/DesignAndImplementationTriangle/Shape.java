package Lesson6.DesignAndImplementationTriangle;

public class Shape {
    double side1 = 1, side2 = 1, side3 = 1;
    String color;

    public Shape() {
    }

    public Shape(double side1, double side2, double side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public String getColor() {
       return color;
    }

    public double getHalfPerimeter() {
        return (side1 + side2 + side3) / 2;
    }

    double p = getHalfPerimeter();

    public double getArea() {
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public double getPerimeter() {
        return 2 * p;
    }

    public String toString() {
        return "Màu sắc, diện tích và chu vi hình tam giác là: " + getColor() + ", " + getArea() + ", " + getPerimeter();
    }

    public static class View{
        public static void main(String[] args) {
            Shape triangle = new Shape(1, 2, 3, "black");
            System.out.println(triangle.toString());
        }
    }
}
