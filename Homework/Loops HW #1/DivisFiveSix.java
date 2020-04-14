public class DivisFiveSix
{
    public static void main(String[] args)
    {
        int i = 100;
        int counter = 0;

        while (i <= 1000)
        {
            if (i % 5 == 0 && i % 6 == 0)
            {
                System.out.print(i + " ");
                counter++;
                
                if (counter % 10 == 0)
                {
                    System.out.print("\n");
                }
            }
            
            i++;
        }
        
    }
}