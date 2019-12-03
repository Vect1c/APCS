public class PerfectNumberWorld
{
    public static boolean findPerfNumber(long x)
    {
        int num = 0;
        for (long j = 1; j < x; j++)
        {
            if (x % j == 0)
            {
                num += j;
            }
        }

        if (x == num)
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
        int counter = 0;
        while (counter < 4)
        {
            for (long x = 1; x > 0; x++)
            {
                if (findPerfNumber(x))
                {
                    System.out.print("\n" + x + " is a Perfect Number.");
                    counter++;
                }
            }
        }
    }
}