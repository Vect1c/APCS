import java.util.Scanner;

public class DashRemoverProPlusEdition
{
    public static String remover(String str)
    {
        return str.replace('-', '\b');
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter social security number in the form, ddd -dd -dddd: ");
        String x = sc.nextLine();

        System.out.print("\n" + remover(x));

        sc.close();
    }
}