public class Cylinder
{
    private Circle base;
    private double height;
    public Cylinder(double r, double h)
    {
        base = new Circle(r); // takes base area from the Circle class
        height = h;
    }

    public double getVolume() // function gets volume
    {
        return base.getArea() * height;
    }
}
