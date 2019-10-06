import java.util.Scanner;

public class PolygonTest{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input amount of sides: ");
    int sides = scan.nextInt();
    System.out.println("Input the amount of length per each side: ");
    double length = scan.nextDouble();
    System.out.println("Input the X coordinate of the center point: ");
    double x = scan.nextDouble();
    System.out.println("Input the Y coordinate of the center point: ");
    double y = scan.nextDouble();
      
    Polygon poly = new Polygon(sides, length, x, y);
    System.out.println("The area of the polygon is: " + poly.getArea());
    System.out.println("The perimeter of the polygon is: " + poly.getPerimeter());
    scan.close();
  }
}