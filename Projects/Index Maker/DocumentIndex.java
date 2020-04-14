import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry>
{
    public DocumentIndex()
    {
        super();
    }
    
    public DocumentIndex(int size)
    {
        super(size);
    }

    public void addWord(String word, int num)
    {
        word.trim();
        for(int k = 0; k < super.size(); k++) 
        {
            if(super.get(k).getWord().equalsIgnoreCase(word)) 
            {
				super.get(k).add(num);
				return;
			}	
		}
		
		IndexEntry entry = new IndexEntry(word);
		entry.add(num);
		int position = super.size();
		
        for(int k = 0; k < super.size(); k++) 
        {
            if(entry.getWord().compareToIgnoreCase(super.get(k).getWord()) < 0) 
            {
				position = k;
				break;
			}
			super.add(position, entry);
		}
    }

    public void addAllWords(String str, int num)
    {
        String[] arrStr = str.split("\\W+");
        for (int k = 0; k < arrStr.length; k++)
        {
            if (!arrStr[k].equals(""))
                addWord(arrStr[k], num);
        }
    }
}