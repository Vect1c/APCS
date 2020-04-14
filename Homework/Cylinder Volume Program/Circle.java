public class Circle
{
  private double radius;
  public Circle(double r)
  {
    radius = r;
  }

  public double getArea() // function gets area
  {
    return Math.PI * Math.pow(radius, 2);
  }
}
