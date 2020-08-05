package Lesson6.ClassPointAndMoveablePoint;

import java.util.Arrays;

public class Point {
    float x = 0.0f, y = 0.0f;
    public Point() {}

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[] {x, y};
    }

    public void setXY(float[] xy) {
        this.x = xy[0];
        this.y = xy[1];
    }

    public String toString() {
        return Arrays.toString(getXY());
    }
}
