import java.util.Scanner;

public class TicTacToe
{
  public static void generateBoard(String[][] board){
    for(int j = 0; j < 3; j++){
      for(int k = 0; k < 3; k++)
      {
        System.out.print(" " + board[j][k] + " ");
        if(k < 2)
        {
          System.out.print("|");
        }
      }
      if(j < 2)
      {
        System.out.println("\n--- --- ---");
      }
    }
    System.out.println();
  }

    public static int findCoordsX(String playerInput)
    {
        return Integer.parseInt(playerInput.substring(0, 1)) - 1;
    }

    public  static int findCoordsY(String playerInput)
    {
        return Integer.parseInt(playerInput.substring(2)) - 1;
    }

    public static boolean free(String[][] game, int row, int column)
    {
        if (game[row][column] == " ")
          return true;
        else 
          return false;
    }

    public static boolean winCase(String[][] game, String player)
    {
        return 
        (game[0][0] == player && game[0][1] == player && game[0][2] == player) || 
        (game[1][0] == player && game[1][1] == player && game[1][2] == player) ||
        (game[2][0] == player && game[2][1] == player && game[2][2] == player) ||
        // diagonal
        (game[0][0] == player && game[1][1] == player && game[2][2] == player) ||
        (game[0][2] == player && game[1][1] == player && game[2][0] == player) ||
        //verticals
        (game[0][0] == player && game[1][0] == player && game[2][0] == player) ||
        (game[0][1] == player && game[1][1] == player && game[2][1] == player) ||
        (game[0][2] == player && game[1][2] == player && game[2][2] == player);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String[][] game = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};

        boolean win = false;
        
        while (win == false)
        {
            String playerInput = " ";
            boolean ok = false;
            while (!ok)
            {
                System.out.println("Player 'X', enter your move (row[1-3] column[1-3])");
                playerInput = sc.nextLine();
                if (free(game, findCoordsX(playerInput), findCoordsY(playerInput)))
                {
                    game[findCoordsX(playerInput)][findCoordsY(playerInput)] = "X";
                    ok = true;
                    generateBoard(game);
                }
                else
                    System.out.print("\nMove is not valid, try again.");

            }            
        if (winCase(game, "X"))
        {
            win = true;
            System.out.print("\nPlayer X' wins!");
            break;
        }
        
        ok = false;
        while(!ok)
        {
          System.out.println("Player 'O', enter your move (row[1-3] column[1-3])");
          playerInput = sc.nextLine();
          if (free(game, findCoordsX(playerInput), findCoordsY(playerInput)))
          {
            game[findCoordsX(playerInput)][findCoordsY(playerInput)] = "O";
            ok = true;
            generateBoard(game);
          }
          else
            System.out.print("\nMove is not valid, try again.");
        }
        if (winCase(game, "O"))
        {
          win = true;
          System.out.println("Player 'O' won!");
          break;
        }
    }
        sc.close();        
    }
}