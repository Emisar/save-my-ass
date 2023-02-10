package org.com.very.easy.tasks.entity;

public class Vector3D {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double z1;
    private double z2;

    public Vector3D() {
        this.x1 = 0;
        this.x2 = 0;
        this.y1 = 0;
        this.y2 = 0;
        this.z1 = 0;
        this.z2 = 0;
    }

    public Vector3D(double x1, double y1, double z1, double x2, double y2, double z2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.z1 = z1;
        this.z2 = z2;
    }

    public Vector3D(Point3D p1, Point3D p2) {
        this.x1 = p1.getX();
        this.x2 = p2.getX();
        this.y1 = p1.getY();
        this.y2 = p2.getY();
        this.z1 = p1.getZ();
        this.z2 = p2.getZ();
    }

    public double getX() {
        return x2 - x1;
    }

    public double getY() {
        return y2 - y1;
    }

    public double getZ() {
        return z2 - z1;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public double getZ1() {
        return z1;
    }

    public double getZ2() {
        return z2;
    }

    public double length() {
        return Math.abs(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2)));
    }

    @Override
    public String toString() {
        return "Vector3D[(" + x1 + ", " + y1 + ", " + z1 + "), (" + x2 + ", " + y2 + ", " + z2 + ")]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return x1 == vector3D.x1 && x2 == vector3D.x2 && y1 == vector3D.y1 && y2 == vector3D.y2 && z1 == vector3D.z1 && z2 == vector3D.z2;
    }
}
