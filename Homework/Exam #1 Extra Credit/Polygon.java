public class Polygon
{
  private int n;
  private double length, x, y;
  
  public Polygon(int sides, double distance, double xCoord, double yCoord)
    {
      n = sides;  
      length = distance;
      x = xCoord;
      y = yCoord;
    }
  
    public double getSides()
    {
      return n;
    }

    public double getLength()
    {
      return length;
    }
  
    public double getX()
    {
      return x;
    }
  
    public double getY()
    {
      return y;
    }
  
    public double getArea()
    {
      return (n * length * length)/(4 * Math.tan(Math.PI/n));
    }    
  
    public double getPerimeter()
    {
      return n * length;
    }    
}