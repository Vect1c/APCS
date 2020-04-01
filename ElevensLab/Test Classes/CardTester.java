public class CardTester
{
    public static void main(String[] args)
    {
        Card h = new Card("Ace", "Spades", 1);
        Card h2 = new Card("King", "Hearts", 13);
        Card h3 = new Card("Ace", "Spades", 1);

        System.out.println("Card h: " + h);
        System.out.println("Card h2: " + h2);
        System.out.println("Card h3: " + h3);
        System.out.println("Card h and Card h3 are the same? " + h.matches(h3));
        System.out.println("Card h and Card h2 are the same? " + h.matches(h2));
    }
}