public class Haiku extends Poem
{
    private int[] syllables = {5, 7, 5};

    public int numLines()
    {
        return syllables.length;
    }

    public int getSyllables(int row)
    {
        return syllables[row];
    }

}
