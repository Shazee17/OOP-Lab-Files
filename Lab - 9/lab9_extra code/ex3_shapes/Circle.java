class Circle extends Shape {
    private int radius;

    public Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public boolean isPointInside(Point p) {
        double distance = getCenter().distanceTo(p);
        return distance <= radius;
    }

    @Override
    public String toString() {
        return "Circle: Center " + getCenter() + ", Radius " + radius;
    }
}
