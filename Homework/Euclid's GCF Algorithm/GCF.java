import java.util.Scanner;

public class GCF
{
    public static int findGCF(int a, int b)
    {
        if (a == b) 
            return a;
        else if (a > b) 
            a = a - b;
        else if (a < b)
        {
            b = b - a;
        }

        return findGCF(a, b);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        System.out.print("\nEnter a second integer: ");
        int b = sc.nextInt();
        System.out.print("\nThe Greatest Common Factor between " + a + " and " + b + " is " + findGCF(a, b));
    }
}