import java.util.ArrayList;

public class IndexEntry 
{
    private String word;
    private ArrayList<Integer> numsList;
  
    public IndexEntry(String word)
    {
        this.word = word.toUpperCase();
        numsList = new ArrayList<Integer>();
    }
  
    public void add(int sum)
    {
        if (numsList.indexOf(sum) < 0)
        numsList.add(new Integer(sum));
    }

    public String getWord()
    {
        return word;
    }

    public String toString()
    {
        String result = "";
        for (int k = 0; k < numsList.size(); k++)
            result += numsList.get(k) + " ";

        return result;
    }
}