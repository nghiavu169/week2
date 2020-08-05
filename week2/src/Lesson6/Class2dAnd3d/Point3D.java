package Lesson6.Class2dAnd3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){}
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), z};
    }

    public void setXYZ(float[] xyz) {
        super.setX(xyz[0]);
        super.setY(xyz[1]);
        this.z = xyz[2];
    }

    public String toString() {
        return "3 cạnh x, y, z là: " + Arrays.toString(getXYZ());
    }
}
