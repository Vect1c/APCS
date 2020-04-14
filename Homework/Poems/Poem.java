public abstract class Poem
{
    public abstract int numLines();

    public abstract int getSyllables(int row);

    public void printRhythm()
    {
        int rows = numLines();

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < getSyllables(i); j++)
            {
                System.out.print("ta-");
            }
            System.out.println();
        }
    }
}