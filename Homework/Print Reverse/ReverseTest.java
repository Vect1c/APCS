import java.util.Scanner;

public class ReverseTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to reverse: ");
        String vBruh = sc.nextLine(); 

        StringReverse yeet = new StringReverse(vBruh);

        System.out.print("\n" + "The text reversed is: " + yeet.reverse());

        sc.close();
    }
}