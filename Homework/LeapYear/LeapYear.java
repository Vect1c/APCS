import java.util.Scanner;

public class LeapYear
{
    public static boolean isLeapYear(int year)
    {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a whole number year: ");
        int year = sc.nextInt();

        boolean yearCheck = isLeapYear(year);

        if (yearCheck)
        {
            System.out.print("\n" + "The year is a leap year!");
        }
        else
        {
            System.out.print("\n" + "The year is not a leap year.");
        }

        sc.close();
    }
}