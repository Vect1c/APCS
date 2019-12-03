import java.util.*;

public class LipogramAnalyzer
{
    private String text;
    public LipogramAnalyzer(String text)
    {
        this.text = text;
    }

    public String allWordsWith(char letter)
    {
        String temp = "";
        String allWordsWith = "";
        List<String> newWordList = new ArrayList<String>();
        
        String wordExtracterArray[] = text.split(" ");
        for (int i = 0; i < wordExtracterArray.length; i++)
        {
            temp = wordExtracterArray[i].replaceAll("\\p{Punct}", "");

            if (temp.contains("" + letter) && !newWordList.contains(temp))
            {
                newWordList.add(temp);
            }
        }

        for (String word : newWordList)
        {
            allWordsWith += word + "\n";
        }

        return allWordsWith;
    }

    public String mark(char letter)
    {
        String editedString = "";
        editedString = text.replace(letter, '#');

        return editedString;
    }
}