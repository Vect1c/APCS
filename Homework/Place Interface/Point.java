public class Point implements Place
{
 private double x, y;

 public Point(double x, double y)
 {
  this.x = x;
  this.y = y;
 }

 public double getX() { return x; }
 public double getY() { return y; }

 public double distance(Place other) 
 {
  return Math.sqrt(Math.pow(x - other.getX(), 2) + Math.pow(y - other.getY(), 2));
 }

 public static boolean sameDistance(Place p1, Place p2, Place p3)
 {
  return (p1.distance(p2) == p1.distance(p3));
 }
}