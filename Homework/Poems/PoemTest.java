public class PoemTest
{
    public static void main(String[] args)
    {
        Poem haiku = new Haiku();
        System.out.println("Number of lines in haiku: " + haiku.numLines());
        for (int j = 0; j < haiku.numLines(); j++)
        {
            System.out.println("Number of syllables in line " + (j + 1) + ": " + haiku.getSyllables(j));
        }
        haiku.printRhythm();

        Poem lim = new Limerick();
        System.out.println("Number of lines in limerick: " + lim.numLines());
        for (int j = 0; j < lim.numLines(); j++) 
        {
            System.out.println("Number of syllables in line " + (j + 1) + ": " + lim.getSyllables(j));
        }
        lim.printRhythm();
    }
}