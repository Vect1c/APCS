import java.util.Scanner;

public class AE
{
    public static String counter(String str)
    {
        int counterA = 0;
        int counterE = 0;
        for (int j = 0; j < str.length(); j++)
        {
            if (str.charAt(j) == 'a')
            {
                counterA++;
            }
            if (str.charAt(j) == 'e')
            {
                counterE++;
            }
        }
        
        return "\n" + "A: " + counterA + "\n" + "E: " + counterE;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a sentence, tell a story, give some advice... anything really: ");
        String x = sc.nextLine();
        System.out.print("" + counter(x));

        sc.close();
    }
}