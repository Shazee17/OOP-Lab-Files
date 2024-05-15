class Shape {
    private Point center;

    public Shape(Point center) {
        this.center = center;
    }

    public boolean isPointInside(Point p) {
        // This method checks if the given point is inside the shape.
        // Implementation depends on the specific shape.
        return false; // Placeholder, needs to be overridden by subclasses
    }

    public Point getCenter() {
        return center;
    }
}
