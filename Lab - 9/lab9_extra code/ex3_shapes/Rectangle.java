class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(Point center, int length, int width) {
        super(center);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public boolean isPointInside(Point p) {
        int centerX = getCenter().getX();
        int centerY = getCenter().getY();
        int minX = centerX - length / 2;
        int minY = centerY - width / 2;
        int maxX = centerX + length / 2;
        int maxY = centerY + width / 2;

        return p.getX() >= minX && p.getX() <= maxX && p.getY() >= minY && p.getY() <= maxY;
    }

    @Override
    public String toString() {
        return "Rectangle: Center " + getCenter() + ", Length " + length + ", Width " + width;
    }
}
