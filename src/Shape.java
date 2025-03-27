public class Shape {
    private Point location;

    public Shape(Point location) {
        this.location = location;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
    public double area(){
        System.out.println("Shape area class");
        return 0;
    }
    public int perimeter(){
        System.out.println("shape perimeter class");
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "location=" + location +
                '}';
    }

}
