public class Card
{
    private String rank, suit; private int pointValue;
    public Card(String rank, String suit, int pointValue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public String getRank() { return rank; }
    public String getSuit() { return suit; }
    public int getPointValue() { return pointValue; }

    public boolean matches(Card other) 
    { 
        return ((this.getRank() == other.getRank()) && 
        (this.getSuit() == other.getSuit()) && 
        this.getPointValue() == other.getPointValue()); 
    }

    public String toString() { return rank + " of " + suit + " (point value = " + pointValue + ")"; }

}

