import java.util.Scanner;

public class RectangleTest
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = input.nextDouble();

        System.out.print("Enter the width: ");
        double width = input.nextDouble();

        Rectangle yourAverageRect =  new Rectangle(length, width); 

        System.out.println("The area of this rectangle is: " + yourAverageRect.getArea());
        
        System.out.print("The perimeter of this rectangle is: " + yourAverageRect.getPerimeter());
        
        input.close();
    }
}