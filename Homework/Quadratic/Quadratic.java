import java.util.Scanner;

public class Quadratic 
{
    public static double solverPlus(double a, double b, double c)
    {
        double x;
        double temp = (b * b) - (4 * a * c);

        x = ((-1 * b) + Math.sqrt(temp)) / 2 * a;

        return x;
    }
    
    public static double solverMinus(double a, double b, double c)
    {
        double x;
        double temp = (b * b) - (4 * a * c);

        x = ((-1 * b) - Math.sqrt(temp)) / 2 * a;

        return x;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("This is a quadratic equation solver(for real numbers only of course.) Equations are in the format ax^2 + bx + c.");
        
        System.out.print("Please enter a value for a: ");
        double a1 = scan.nextDouble();
        
        System.out.print("\n" + "Please enter a value for b: ");
        double b1 = scan.nextDouble();

        System.out.print("\n" + "Please enter a value for c: ");
        double c1 = scan.nextDouble();

        double checker = (b1 * b1) - (4 * a1 * c1);

        if (checker > 0) 
        {
            System.out.print("\n" + "Your x values are: " + solverPlus(a1, b1, c1) + " and " + solverMinus(a1, b1, c1));
        }
        else if (checker == 0)
        {
            System.out.print("\n" + "These values return only one value for x, and that value is: " + solverPlus(a1, b1, c1));
        }
        else 
        {
            System.out.print("\n" + "Your values result in a non-real root.");
        }
    }
}
