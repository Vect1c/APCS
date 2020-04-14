import java.util.Scanner;

public class Rps
{
  public static int cpuChoice()
  {
      int chooser = (int) (3 * Math.random());
      return chooser;
  }

  public static String play(int s)
  {
    String cpuPlay = "";
    switch (s)
    {
      case 0:
        cpuPlay = "Rock";
      break;
      case 1: 
        cpuPlay = "Paper";
      break;
      case 2: 
        cpuPlay = "Scissors";
      break;
    }
    
    return cpuPlay;
  }

  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissors: ");
      
      int player = sc.nextInt();
      int cpu = cpuChoice();

      String player1 = play(player);
      String cpu1 = play(cpu);

      System.out.print("\n" + "You played " + player1 + "! The computer played " + cpu1 + "!");

      if (player1 == "Rock")
      {
          if (cpu1 == "Rock")
          {
            System.out.print("\n" + "You tied.");
          }
          else if (cpu1 == "Scissors")
          {
            System.out.print("\n" + "You win!");
          }
          else if (cpu1 == "Paper")
          {
            System.out.print("\n" + "You lost.");
          }
      }
      else if (player1 == "Scissors")
      {
          if (cpu1 == "Rock")
          {
            System.out.print("\n" + "You lost.");
          }
          else if (cpu1 == "Scissors")
          {
            System.out.print("\n" + "You tied.");
          }
          else if (cpu1 == "Paper")
          {
            System.out.print("\n" + "You win!");;
          }
      }
      else if (player1 == "Paper")
      {
          if (cpu1 == "Rock")
          {
            System.out.print("\n" + "You win!");
          }
          else if (cpu1 == "Scissors")
          {
            System.out.print("\n" + "You lost.");
          }
          else if (cpu1 == "Paper")
          {
            System.out.print("\n" + "You tied.");
          }
      }

      sc.close();
  }
}