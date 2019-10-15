import java.util.Scanner;

public class Swap
{
    public static int swapPlaces(int x)
    {
      int i = x % 10; // ones place
      int j = (x % 100) - i; // tens place
      int t = x - j - i; // hundreds place
            
      i = i * 10;
      j = j / 10;
      
      return t + j + i;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a positive interger less than 1000: ");
        int num = scan.nextInt();
        
          while (num > 1000 || num < 0)
          {
            if (num > 1000)
            {
                System.out.print("\n" + "This number is greater than 1000, please try again: ");
                num = scan.nextInt();
            }
            else if (num < 0)
            {
                System.out.print("\n" + "This number is negative, please try again: ");
                num = scan.nextInt();
            }
          }
        
        System.out.print("\n" + "Swapping numbers... " + "\n" + "New number is: " + swapPlaces(num));

        scan.close();
    }
}

