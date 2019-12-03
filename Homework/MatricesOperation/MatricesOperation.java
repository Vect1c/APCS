import java.util.Scanner;

public class MatricesOperation
{
    public static boolean matrixTest(int choice, int[][] arr, int[][] arr2)
    {
        boolean result = false;

            if (choice == 1 || choice == 2) // method returns true if the matrices are addable or subtractable.
                result = (arr[0].length == arr2[0].length && arr.length == arr2.length);
            else if (choice == 3) // method returns true if the matrices are multiplyable.
                result = (arr[0].length == arr2.length);

        return result;
    }

    public static int[][] adder(int[][] arr, int[][] arr2)
    {
        int[][] newArr = new int[arr.length][arr[0].length];

        for (int j = 0; j < arr[0].length; j++)
        {
            for (int k = 0; k < arr.length; k++)
            {
                newArr[j][k] = arr[j][k] + arr2[j][k];
            }
        }

        return newArr;
    }

    public static int[][] subtractor(int [][] arr, int[][] arr2)
    {
        int[][] newArr = new int[arr.length][arr[0].length];

        for (int j = 0; j < arr[0].length; j++)
        {
            for (int k = 0; k < arr.length; k++)
            {
                newArr[j][k] = arr[j][k] - arr2[j][k];
            }
        }

        return newArr;
    }

    public static int[][] multiplyer(int[][] arr, int[][] arr2)
    {
        int[][] newArr = new int[arr.length][arr2[0].length];

        for (int x = 0; x < newArr[0].length; x++)
        {
            for (int j = 0; j < newArr.length; j++)
            {
                for (int k = 0; k < arr.length; k++)
                {
                    newArr[x][j] += arr[x][k] * arr2[k][j];
                }
            }
        }

        return newArr;
    }

    public static void matrixPrinter(int[][] arr)
    {
        for (int j = 0; j < arr[0].length; j++)
        {
            for (int k = 0; k < arr.length; k++)
            {
                System.out.print(arr[j][k] + " ");
            }

            System.out.print("\n");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Hello user, welcome to the 3-function matrix calculator. Enter 1 for addition, 2 for subtraction and 3 for multiplication: ");
        
        int choice = sc.nextInt();
        System.out.print("\nPlease enter number of rows for matrix 1: ");
        int rows = sc.nextInt();
        System.out.print("\nPlease enter number of columns for matrix 1: ");
        int columns = sc.nextInt();

        System.out.print("\nPlease enter number of rows for matrix 2: ");
        int rows2 = sc.nextInt();
        System.out.print("\nPlease enter number of columns for matrix 2: ");
        int columns2 = sc.nextInt();

        int[][] arr = new int[rows][columns];
        int[][] arr2 = new int[rows2][columns2];

        while (!matrixTest(choice, arr, arr2))
        {
            System.out.print("\nUh oh, those dimensions don't allow for the chosen operation.");
            System.out.print("\nPlease enter number of rows for matrix 1: ");
            rows = sc.nextInt();
            System.out.print("\nPlease enter number of columns for matrix 1: ");
            columns = sc.nextInt();
    
            System.out.print("\nPlease enter number of rows for matrix 2: ");
            rows2 = sc.nextInt();
            System.out.print("\nPlease enter number of columns for matrix 2: ");
            columns2 = sc.nextInt();

            arr = new int[rows][columns];
            arr2 = new int[rows2][columns2];
        }

        System.out.print("\nEnter values for matrix 1: ");

        for (int j = 0; j < rows; j++)
        {
            for (int k = 0; k < columns; k++)
            {
                System.out.print("\n" + "[" + j + "]" + " [" + k + "] : ");
                arr[j][k] = sc.nextInt();
            }
        }
        
        System.out.print("\nEnter values for matrix 2: ");

        for (int j = 0; j < rows2; j++)
        {
            for (int k = 0; k < columns2; k++)
            {
                System.out.print("\n" + "[" + j + "]" + " [" + k + "] : ");
                arr2[j][k] = sc.nextInt();
            }
        }
        
        switch (choice)
        {
            case 1:
            matrixPrinter(adder(arr, arr2));
            break;
            case 2:
            matrixPrinter(subtractor(arr, arr2));
            break;
            case 3:
            matrixPrinter(multiplyer(arr, arr2));
            break;
        }

        sc.close();
    }
}

