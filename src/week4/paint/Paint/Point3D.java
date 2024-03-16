package week4.paint.Paint;

public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    public Point3D(){
        super();
    }
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                '}';
    }
    @Override
    public double distance(){
        return Math.sqrt(getX()*getX() + getY()*getY() + z*z);
    }

    @Override
    // Trả về khoảng cách giữa hai điểm
    public double distance(Point2D p) {
        double dx = (getX() - p.getX())*(getX() - p.getX());
        double dy = (getY() - p.getY())*(getY() - p.getY());
        double dz = 0;
        if (p instanceof Point3D){
            dz = (z - ((Point3D)p).z)*(z - ((Point3D)p).z);
        }
        return Math.sqrt(dx + dy + dz);
    }
    @Override
    // Trả về điểm đối xứng qua gốc toạ độ
    public Point2D symmetric(){
        return new Point3D(-getX(), -getY(), -z);
    }
    // Tịnh tiến điểm một khoảng dx, dy, dz
    public void translate(double dx, double dy, double dz){
        setX(getX() + dx);
        setY(getY() + dy);
        z += dz;
    }

    @Override
    public Point2D diemDoiXungQua(Point2D p) {
        Point3D t = new Point3D();
        t.setX(2*p.getX() - this.getX());
        t.setY(2*p.getY() - this.getY());
        if (p instanceof Point3D) {
            t.setZ(2*((Point3D)p).getZ() - this.getZ());
        }
        return t;
    }
}
