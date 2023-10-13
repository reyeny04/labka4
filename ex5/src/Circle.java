public class Circle implements Shape {
    private double _radius;

    public Circle(double radius) {
        _radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * _radius * _radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * _radius;
    }
}
