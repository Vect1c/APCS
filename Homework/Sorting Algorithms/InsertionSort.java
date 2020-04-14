import java.util.Arrays;

public class InsertionSort
{
    public static void insertSort(int[] arr, int x, int n)
    {
        if (n <= 1)
            return;

        int yeet = arr[x];
        int tes = x;
        
        while (tes > 0 && arr[x - 1] > yeet)
        {
            arr[tes] = arr[tes - 1];
            tes--;
        }

        arr[tes] = yeet;

        if (x + 1 <= n)
            insertSort(arr, x + 1, n);
    }

    public static void main(String[] args)
    {
        int[] arr = {19, 7, 8, 6, -43, -50, 10, 49};
        System.out.println("Before Sort: " + Arrays.toString(arr));

        insertSort(arr, 1, arr.length - 1);
 
        System.out.println("After Sort: " + Arrays.toString(arr));
    }
}
