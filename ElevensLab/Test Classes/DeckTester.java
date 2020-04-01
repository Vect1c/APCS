public class DeckTester
{
    public static void main(String[] args)
    {
        String[] ranks1 = {"jack", "queen", "king"};
        String[] suits1 = {"blue", "red"};
        int[] pointValues1 = {11, 12, 13};
        Deck d = new Deck(ranks1, suits1, pointValues1);

        String[] ranks2 = {"ace", "two", "three", "four"};
        String[] suits2 = {"spades", "diamonds", "hearts"};
        int[] pointValues2 = {1, 2, 3, 4};
        Deck h = new Deck(ranks2, suits2, pointValues2);

        System.out.println("Is Deck d empty? " + d.isEmpty());
        System.out.println("Dealing from deck h... Old size: " + h.size() + 
        "\nCard dealt: " + h.deal() + "\nNew Size: " + h.size());
    }
}