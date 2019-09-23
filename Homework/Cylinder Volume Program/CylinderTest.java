import java.util.Scanner;

public class CylinderTest
{
    public static void main(String[] args) 
    {
        // circle 
        Scanner circleRadius = new Scanner(System.in); // takes user input for radius of the base
        System.out.print("Enter the radius: ");
        
        double radius = circleRadius.nextDouble();  
        Circle c = new Circle(radius);
        double area = c.getArea();
        
        System.out.println("Your base area is " + area); // returns area to the user
        
        circleRadius.close();
        
        // cylinder 
        Scanner cylinderHeight = new Scanner(System.in);
        System.out.print("Enter the height: "); // takes user input for height of the cylinder
        
        double height = cylinderHeight.nextDouble(); 
        Cylinder gamerCylinder = new Cylinder(area, height);
        double volume = gamerCylinder.getVolume();
        
        System.out.print("The volume is " + volume); // returns volume to the user
        cylinderHeight.close();
    }  
}

