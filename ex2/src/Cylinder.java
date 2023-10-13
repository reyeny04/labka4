public class Cylinder extends ThreeDGeometric{
    private double _radius;
    private double _height;
    public Cylinder(double radius, double height) {
        _radius = radius;
        _height = height;
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(_radius, 2) * _height;
    }

    @Override
    public double surfaceArea() {
        double baseArea = 2 * Math.PI * Math.pow(_radius, 2);
        double lateralArea = 2 * Math.PI * _radius * _height;
        return baseArea + lateralArea;
    }
}
