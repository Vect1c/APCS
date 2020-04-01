import java.util.Scanner;

public class Sorting
{
    public static int[] randIntElements(int size, int max)
    {
        int[] arr = new int[size];
        for (int j = 0; j < arr.length; j++)
        {
            int k = (int)(Math.random() * max + 1); 
            
            while (arrayContains(arr, k))
            {
                k = (int)(Math.random() * max + 1);
            }
            
            arr[j] = k;
        }

        return arr;
    }

    public static boolean arrayContains(int[] arr, int n)
    {
        boolean result = false;
        for (int j = 0; j < arr.length; j++)
        {  
            if (arr[j] == n)
                result = true;
        }
        return result;
    }

    public static int search(int[] arr, int searchTerm)
    {
        int count = 0;
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] != searchTerm)
                count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        int arr[] = randIntElements(100, 200);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int searchTerm = sc.nextInt();
        System.out.print("\nNumber of Comparisons: " + search(arr, searchTerm));
        sc.close();
    }
}