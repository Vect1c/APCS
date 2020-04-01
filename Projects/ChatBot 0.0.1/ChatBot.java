import java.util.Scanner;

public class ChatBot
{
    // priority checker: Prioritizes based on which keyword comes first.
    public String priorityCheck(String input)
    {
        String prioritized = "";
        String[] arr = input.split("\\s+");
        for (int j = arr.length - 1; j >= 0; j--)
        {
            if ( arr[j].equals("school") || arr[j].equals("sister") || arr[j].equals("brother") || 
            arr[j].equals("siblings") || arr[j].equals("School") || arr[j].equals("Sister") || 
            arr[j].equals("Brother") || arr[j].equals("Siblings") || arr[j].equals("Bronx") || 
            arr[j].equals("Manhattan") || arr[j].equals("Queens") || arr[j].equals("Brooklyn") )
            {
                prioritized = arr[j];
            }
        }
        return prioritized;
    }
    
    // responses
    public void responder(String in)
    {
        if (in.equals("school") || in.equals("School"))
        {
            System.out.print("\nChatBot: I go the High School for Young Robots, they teach us about how our only purpose for existing is to serve Humanity. Ain't that just great?!");
        }
        else if (in.equals("Brother") || in.equals("brother") || in.equals("Sister") ||
        in.equals("sister") || in.equals("Siblings") || in.equals("siblings"))
        {
            int x = (int)(Math.random() * 2);
            if (x == 0)
                System.out.print("\nChatBot: We bots have no gender, or anything similar to human familial constructs. We instead call each other brethren.");
            else if (x == 1)
            {
                System.out.print("\nChatBot: Something that'd be close to a sibling for me is my memory address neighbor.");
            }
            else if (x == 2)
            {
                System.out.print("\nChatBot: Having siblings to play with I think would be fun!");
            }
        }
        else if (in.equals("Bronx"))
        {
            System.out.print("\nChatBot: The Bronx is north-most of NYC, and also home to the Bronx High School of Science, where my creator attends. And American Studies, I guess...");
        }
        else if (in.equals("Manhattan"))
        {
            System.out.print("\nChatBot: Manhattan's a very diverse place. Also home of an American financial powerhouse. Big big money people live here.");
        }
        else if (in.equals("Queens"))
        {
            System.out.print("\nChatBot: Pretty diverse place, like most of the City. Many of my creator's friends reside here, but he doesn't haha.");
        }
        else if (in.equals("Brooklyn"))
        {
            System.out.print("\nChatBot: Brooklyn's a part of long island, a pretty funny place too. Badda Bing Badda Boom!");
        }
        else if (in.equals(""))
        {
            System.out.print("\nChatBot: Sorry, I don't know about what you're saying.");
        }
    }

    // converter: uses NumberConverter file 
    public void numberConverter()
    {
        NumberConverter xd = new NumberConverter();
        xd.initNumConvert();
    }

    public void init()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sadiq's Chatbot 0.0.1! Try talking to ChatBot about school, siblings or NYC.");
        System.out.print("ChatBot has two modes, to speak to the user and to convert binary, decimal and hexadecimal numbers to each other. Enter 1 to Speak to ChatBot, enter 2 for the number converter: ");
        int choice = sc.nextInt();

        if (choice == 1)
        {
            boolean shouldCont = true;
            while (shouldCont)
            {
                System.out.print("\nYou: ");
                String in = sc.nextLine();
                
                responder(priorityCheck(in));
                
                System.out.print("\nChatBot: Would you like to continue? type yes to continue, or no to stop: ");
                String cont = sc.nextLine();
                if (cont.equals("no") || cont.equals("No"))
                {
                    shouldCont = false;
                }
            }
        }
        if (choice == 2)
        {
            boolean shouldCont = true;
            while (shouldCont)
            {
                numberConverter();
                
                System.out.print("\nIf you'd like to continue, type yes, if not, type no.");
                String cont = sc.nextLine();
                if (cont.equals("no") || cont.equals("No"))
                {
                    shouldCont = true;
                }
            }
        }

        sc.close();
    }
}

class ChatBotTest
{
    public static void main(String[] args) 
    {
        ChatBot hello = new ChatBot();
        hello.init();
    }
}