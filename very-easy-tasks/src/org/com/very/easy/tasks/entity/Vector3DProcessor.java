package org.com.very.easy.tasks.entity;

public class Vector3DProcessor {

    public static Vector3D sum(Vector3D vector1, Vector3D vector2) {
        double x = vector1.getX() + vector2.getX();
        double y = vector1.getY() + vector2.getY();
        double z = vector1.getZ() + vector2.getZ();
        return new Vector3D(vector1.getX1(), vector1.getY1(), vector1.getZ1(), x, y, z);
    }

    public static Vector3D sub(Vector3D vector1, Vector3D vector2) {
        Vector3D reverseVector2 = new Vector3D(
                vector2.getX2(), vector2.getY2(), vector2.getZ2(),
                vector2.getX1(), vector2.getY1(), vector2.getZ1()
        );
        return sum(vector1, reverseVector2);
    }

    public static double scalMult(Vector3D vector1, Vector3D vector2) {
        double cos = (vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY() + vector1.getZ() * vector2.getZ()) / (vector1.length() * vector2.length());
        return vector1.length() * vector2.length() * cos;
    }

    public static Vector3D vectMult(Vector3D vector1, Vector3D vector2) {
        double x = vector1.getY() * vector2.getZ() - vector1.getZ() * vector2.getY();
        double y = vector1.getZ() * vector2.getX() - vector1.getX() * vector2.getZ();
        double z = vector1.getX() * vector2.getY() - vector1.getY() * vector2.getX();
        return new Vector3D(vector1.getX1(), vector1.getY1(), vector1.getZ1(), x, y, z);
    }

    public static boolean isCollinear(Vector3D vector1, Vector3D vector2) {
        return isMultiplierExist(vector1, vector2) ||
                checkRatioBetweenVectorsCoordinates(vector1, vector2) ||
                isVectMultEqualsZeroVector(vector1, vector2);
    }

    private static boolean isMultiplierExist(Vector3D vector1, Vector3D vector2) {
        double n;
        if (vector1.getX() != 0) {
            n = vector1.getX() / vector2.getX();
        } else if (vector1.getY() != 0) {
            n = vector1.getY() / vector2.getY();
        } else if (vector1.getZ() != 0) {
            n = vector1.getZ() / vector2.getZ();
        } else {
            return false;
        }
        return vector1.equals(scalMult(vector2, n));
    }

    public static Vector3D scalMult(Vector3D vector, double n) {
        return new Vector3D(
                vector.getX1() * n, vector.getY1() * n, vector.getZ1() * n,
                vector.getX2() * n, vector.getY2() * n, vector.getZ2() * n
        );
    }

    private static boolean checkRatioBetweenVectorsCoordinates(Vector3D vector1, Vector3D vector2) {
        double xRatio = vector1.getX() / vector2.getX();
        double yRatio = vector1.getY() / vector2.getY();
        double zRatio = vector1.getZ() / vector2.getZ();
        return xRatio == yRatio && yRatio == zRatio;
    }

    private static boolean isVectMultEqualsZeroVector(Vector3D vector1, Vector3D vector2) {
        return new Vector3D().equals(vectMult(vector1, vector2));
    }
}
