public class Triangle extends Shape {
    private int sideA, SideB, SideC;


    public Triangle(Point location, int sideA, int sideB, int sideC) {
        super(location);
        setSideB(sideB);
        setSideA(sideA);
        setSideC(sideC);


    }


    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return SideB;
    }

    public void setSideB(int sideB) {

        SideB = sideB;
    }

    public int getSideC() {
        return SideC;
    }

    public void setSideC(int sideC) {
        SideC = sideC;
    }
    @Override
    public double perimeter(){
        return  (sideA + sideB +SideC);
    }
    @Override
    public double area(){
        return (sideA * sideB)/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Location" + this.getLocation()+
                "sideA=" + sideA +
                ", SideB=" + SideB +
                ", SideC=" + SideC +
                '}';
    }
}
