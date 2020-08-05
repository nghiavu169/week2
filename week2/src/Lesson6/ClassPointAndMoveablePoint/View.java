package Lesson6.ClassPointAndMoveablePoint;

public class View {
    public static void main(String[] args) {
        MoveablePoint point1 = new MoveablePoint(1, 2);
        System.out.println(point1);
        point1.move();
        System.out.println(point1);

        MoveablePoint point2 = new MoveablePoint(0, 0, 2, 2);
        System.out.println(point2);
        point2.move();
        System.out.println(point2);
    }
}
