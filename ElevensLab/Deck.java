import java.util.List;
import java.util.ArrayList;

public class Deck
{
    private List<Card> cards; private int size;
    public Deck(String[] ranks, String[] suits, int[] values)
    {
        cards = new ArrayList<Card>();
        for (int k = 0; k < suits.length; k++)
        {
            for (int j = 0; j < ranks.length; j++)
            {
                cards.add(new Card(ranks[j], suits[k], values[j]));
            }
        }

        this.size = cards.size();
    }

    public boolean isEmpty() { return (size == 0); }
    public int size() { return size; }
    
    public Card deal() 
    { 
        size--; 
        return cards.get(size - 1); 
    }
}