import java.util.Scanner;

public class SumArray
{
    public static int gettingSum(int x, int y, int z, int a, int b)
    {
        int arr[] = {x, y, z, a, b};

        int result = 0;

        for (int m : arr)
        {
            result += m;
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter 1st integer: ");
        int x = sc.nextInt();
        
        System.out.print("\n" + "Please enter 2nd integer: ");
        int y = sc.nextInt();

        System.out.print("\n" + "Please enter 3rd integer: ");
        int z = sc.nextInt();

        System.out.print("\n" + "Please enter 4th integer: ");
        int a = sc.nextInt();

        System.out.print("\n" + "Please enter 5th integer: ");
        int b = sc.nextInt();

        System.out.print("\n" + "The sum is:" + gettingSum(x, y, z, a, b));

        sc.close();
    }
}