package org.example;

public class Point3D {
    double x;
    double y;
    double z;

    public Point3D() {
    }

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * @return Длина вектора
     */
    public double lengthVector() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scolor(Point3D pointIn) {
        return x * pointIn.x + y * pointIn.y + z * pointIn.z;
    }

    public Point3D multy(Point3D pointIn) {
        return new Point3D(y * pointIn.z - z * pointIn.y,
                z * pointIn.x - x * pointIn.z, x * pointIn.y - y * pointIn.x);
    }

    public double cosTriangle(Point3D pointIn) {
        return scolor(pointIn) / (lengthVector() * pointIn.lengthVector());
    }

    public Point3D sum(Point3D pointIn) {
        return new Point3D(x + pointIn.x, y + pointIn.y, z + pointIn.z);
    }

    public Point3D dif(Point3D pointIn) {
        return new Point3D(x - pointIn.x, y - pointIn.y, z - pointIn.z);
    }
}
