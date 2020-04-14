import java.util.Scanner;

public class Random2DArray
{
    public static int[][] createArray(int square)
    {
        int[][] arr = new int[square][square];

        for (int j = 0; j < arr.length; j++)
        {
            for (int i = 0; i < arr[0].length; i++)
            {
                arr[j][i] = (int)((Math.random() * 20) + 1);
            }
        }

        return arr;
    }

    public static int[] leastAndGreatest(int[][] arr)
    {
        int least = arr[0][0];
        int greatest =  arr[0][0];

        for (int j = 0; j < arr.length; j++)
        {
            for (int i = 0; i < arr[0].length; i++)
            {
                if (arr[j][i] < least)
                {
                    least = arr[j][i];
                }
                if (arr[j][i] > greatest)
                {
                    greatest = arr[j][i];
                }
            }
        }

        int[] newArr = {least, greatest};
        return newArr;
    }

    public static void printArr(int[][] arr)
    {
        for (int j = 0; j < arr.length; j++)
        {
            for (int i = 0; i < arr[0].length; i++)
            {
                System.out.print(arr[j][i] + " ");
            }

            System.out.print("\n");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a dimension: ");
        int square = sc.nextInt();

        int[][] arr = createArray(square);

        printArr(arr);

        int[] guesses = leastAndGreatest(arr);
        
        System.out.print("\n" + "Enter the largest number: ");
        int guessLargest = sc.nextInt();

        if (guessLargest == guesses[1])
            System.out.print("\n" + "You're correct!");
        else 
            System.out.print("\n" + "Ooh, tough luck. Incorrect.");

        System.out.print("\n" + "Enter the smallest number: ");
        int guessSmallest = sc.nextInt();

        if (guessSmallest == guesses[0])
            System.out.print("\n" + "You're correct!");
        else 
            System.out.print("\n" + "Ooh, tough luck. Incorrect.");

        sc.close();
    }
}