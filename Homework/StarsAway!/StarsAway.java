import java.util.Scanner;

public class StarsAway
{
    public static String alignLeft(int height)
    {
        String star = "";
        for (int x = 0; x < height; x++)
        {
            star += "*";
            System.out.println(star);
        }
        
        return "";
    }

    public static String alignRight(int height)
    {
        for (int x = 0; x <= height; x++)
        {
            for (int s = height ; s >= x; s--)
            {
                System.out.print(" ");
            }

            for (int j = 0; j < x; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        return "";
    }

    public static String alignCenter(int height)
    {
        for (int x = 0; x <= height; x++)
        {
            for (int s = height; s > x; s--)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= (x * 2) - 1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        
        return "";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n" + "Enter height of the asterisk triangle(at least 4): ");
        int height = sc.nextInt(); 

        System.out.print("\n" + "Enter 1 for left alignment, 2 for right alignment, or 3 for center alignment: ");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
            System.out.print(alignLeft(height));
            break;
            case 2:
            System.out.print(alignRight(height));
            break;
            case 3:
            System.out.print(alignCenter(height));
            break;
        }

        sc.close();
    }
}












