import java.util.Scanner;

public class Cooney 
{
    public static void main(String[] args)
    {
        int correct = 0;
        int counter = 0;
        System.out.println("Try to figure out what Cooney likes:" + "\n"+ "Cooney likes MOON but he doesn't like SUN" + "\n" + "Cooney likes SOCCER but he doesn't like HOCKEY" + "\n" + "Cooney likes SUMMER but he doesn't like SPRING" + "\n" + "Does Cooney like ... (enter one word below):");
        
        while (correct < 5)
        {
          Scanner sc = new Scanner(System.in);
          String input = sc.nextLine();
          for (int i = 0; i < input.length() - 1; i++)
          {
            if (input.charAt(i) != input.charAt(i + 1))
            {
                counter = 1;
            }
            else
            {
                counter = 0;
                break;
            }
          }
          
          if (counter == 0)
          {
            correct++;
            System.out.println("Yes, Cooney likes " + input + ".");
          }
          else
          {
            correct = 0;
            System.out.println("No, Cooney dislikes " + input + ".");
          }
        }

        System.out.println("I think you got the rule... I quit!" + "\n" + "Thaanks forr pplaying!");
    }
}
