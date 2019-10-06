import java.utils.Scanner;

public class TestLine
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the x-coordinate for Line 1, Point 1: ");
        double x1 = scan.nextDouble();
        System.out.println("Enter the y-coordinate for Line1, Point 1: ");
        double y1 = scan.nextDouble();

        System.out.println("Enter the x-coordinate for Line 1, Point 2: ");
        double x2 = scan.nextDouble();
        System.out.println("Enter the y-coordinate for Line 2, Point 2: ");
        double y2 = scan.nextDouble();

        System.out.println("Enter the x-coordinate for Line 2, Point 1: ");
        double x3 = scan.nextDouble();
        System.out.println("Enter the y-coordinate for Line 2, Point 1: ");
        double y3 = scan.nextDouble();

        System.out.println("Enter the x-coordinate for Line 2, Point 2: ");
        double x4 = scan.nextDouble();
        System.out.println("Enter the y-coordinate for Line 2, Point 2: ");
        double y4 = scan.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);
        Point p4 = new Point(x4, y4);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);

        if (l1.isIntersect(l2))
    }
}