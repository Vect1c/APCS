import java.util.Scanner;

public class TriangleTest
{
    public static void main(String[] args)
    {
        //  takes coordinate inputs
        Scanner input =  new Scanner(System.in);
    
        System.out.println("Enter the first x-coordinate: ");
        double x1 = input.nextDouble();

        System.out.println("Enter the first y-coordinate: ");
        double y1 = input.nextDouble();

        System.out.println("Enter the second x-coordinate: ");
        double x2 = input.nextDouble();

        System.out.println("Enter the second y-coordinate: ");
        double y2 = input.nextDouble();

        System.out.println("Enter the third x-coordinate: ");
        double x3 = input.nextDouble();

        System.out.println("Enter the third y-coordinate: ");
        double y3 = input.nextDouble();

        // new Triangle object
        Triangle t = new Triangle(x1, y1, x2, y2, x3, y3); 

        System.out.println("The perimeter of your triangle is: " + t.getPerimeter());
        System.out.println("The area of your triangle is: " + t.getArea());

        input.close();
    }

}