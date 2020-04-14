import java.util.Scanner;

public class TimeToSeconds
{
    public static double convertToSeconds(double hours, double minutes, double seconds)
    {
        return (hours * 60 * 60) + (minutes * 60) + seconds;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of hours: ");
        double h = scan.nextDouble();
        
        System.out.print("\n" + "Enter the number of minutes: ");
        double m = scan.nextDouble();
        
        System.out.print("\n" + "Enter the number of seconds: ");
        double s = scan.nextDouble();

        System.out.print("\n" + "The total number of seconds is: " + convertToSeconds(h, m, s));

        scan.close();
    }
}