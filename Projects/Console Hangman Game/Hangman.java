import java.util.Scanner;

public class Hangman
{
    public static String wordBank()
    {
        String str = "";
        int joe = (int) (Math.random() * 5);
        switch (joe) 
        {
            case 0:
            str = "cat";
            System.out.print("\n" + "Your word has 3 letters!");
            break;
            case 1:
            str = "epic";
            System.out.print("\n" + "Your word has 4 letters!");
            break;
            case 2:
            str = "gamer";
            System.out.print("\n" + "Your word has 5 letters!");
            break;
            case 3:
            str = "number";
            System.out.print("\n" + "Your word has 6 letters!");
            break;
            case 4:
            str = "picture";
            System.out.print("\n" + "Your word has 7 letters!");
            break;
        }

        return str;
    }

    public static void hangmanGame(String str)
    {
        Scanner sc = new Scanner(System.in);
        String placeHolders = "";
        for (int j = 0; j < str.length(); j++)
        {
            placeHolders += "_";
        }

        int tries = 3;
        while (tries > 0)
        {
            System.out.print("\n" + "Enter a new letter: ");
            String player = sc.next();
        
            if (str.indexOf(player) == -1)
            {
                System.out.print("\n" + "No letters match... try again.");
                tries--;
            }
            else if (str.indexOf(player) >= 0)
            {
                placeHolders = placeHolders.substring(0, str.indexOf(player)) + player + placeHolders.substring(str.indexOf(player) + 1);
                System.out.print("\n" + "Good job! " + placeHolders);
            }

            if (placeHolders.equals(str))
            {
                System.out.print("\n" + "Congrats! You win. Would you like to play again?");
                playersDream();
            }

            if (tries == 0)
            {
                System.out.print("\n" + "You lose... would you like to play again?");
                playersDream();
            }
        }

        sc.close();
    }

    public static void playersDream()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n" + "Enter 1 for yes, 2 for no: ");
        int playAgain = sc.nextInt();
        
        if (playAgain == 1)
        {
            hangmanGame(wordBank());
        }
        if (playAgain == 2)
        {
            System.out.print("\n" + "Goodbye.");
        }

        sc.close();
    }

    public static void main(String[] args)
    {
        System.out.print("Ah yes, time for HANGMAN. All letters are lowercase. Have fun!");
        hangmanGame(wordBank());
    }
}