package Lesson6.Class2dAnd3d;


import java.util.Arrays;

public class Point2D {
    private float x = 0.0f, y = 0.0f;
    public Point2D(){}
    public Point2D(float x, float y){
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
        return new float[]{x, y};
    }

    public void setXY(float[] xy) {
        this.x = xy[0];
        this.y = xy[1];
    }

    public String toString() {
        return "2 cạnh x, y là: " + Arrays.toString(getXY());
    }
}
